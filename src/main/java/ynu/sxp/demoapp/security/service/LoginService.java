package ynu.sxp.demoapp.security.service;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ynu.sxp.demoapp.captcha.service.CaptchaService;
import ynu.sxp.demoapp.common.exception.LoginCaptchaException;
import ynu.sxp.demoapp.security.dto.LoginRO;
import ynu.sxp.demoapp.security.entity.LoginAttemptEntity;
import ynu.sxp.demoapp.security.repository.ILoginAttemptRepository;
import ynu.sxp.demoapp.user.entity.UserEntity;
import ynu.sxp.demoapp.user.service.UserService;

import javax.security.auth.login.LoginException;
import java.time.LocalDateTime;

@CommonsLog
@Service
public class LoginService {
    // 密码编码器
    private final PasswordEncoder passwordEncoder;
    @Value("${app.login.max-attempt-count:20}")  // 最大尝试次数，从配置文件中读取
    private int maxAttemptCount;
    @Value("${app.login.lock-duration:120}")    // 锁定时长(单位：分钟)，从配置文件中读取
    private int lockDuration;

    private final UserService userService;
    private final CaptchaService captchaService;
    private final ILoginAttemptRepository loginAttemptRepository;

    public LoginService(
            UserService userService,
            CaptchaService captchaService,
            ILoginAttemptRepository loginAttemptRepository
    ) {
        this.userService = userService;
        this.captchaService = captchaService;
        this.loginAttemptRepository = loginAttemptRepository;
        this.passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    private void checkUserExists(LoginContext context) throws LoginException {
        context.userEntity = userService.getUserByCode(context.loginRO.username)
                .orElseThrow(() -> new LoginException("用户不存在！"));
    }

    private void checkUserLock(LoginContext context) throws LoginException {
        var attemptEntity = loginAttemptRepository.findByUserId(context.userEntity.getId());
        if (attemptEntity.isEmpty()) {
            return;
        }
        context.attemptEntity = attemptEntity.get();
        if (context.attemptEntity.getAttemptCount() >= maxAttemptCount) {
            if (context.attemptEntity.getLastAttemptTime().plusMinutes(lockDuration).isAfter(LocalDateTime.now())) {
                throw new LoginException("登录失败次数过多,请在 " + lockDuration + " 分钟后再试！");
            }
        }
    }

    private void checkCaptcha(LoginContext context) throws LoginException {
        if (context.attemptEntity==null || context.attemptEntity.getAttemptCount() < 3) {
            return;
        }
        if (context.loginRO.captcha == null) {
            throw new LoginCaptchaException("需要输入验证码！");
        }
        if (!this.captchaService.validateCaptcha(context.loginRO.captcha)) {
            throw new LoginCaptchaException("验证码错误！");
        }
    }

    private void checkPasword(LoginContext context) throws LoginException {
        context.isLoginSuccess = this.userService.validateUserPassword(context.userEntity, context.loginRO.password);
        if (!context.isLoginSuccess) {
            throw new LoginException("密码错误！");
        }
    }


    private void updateAttemptEntity(LoginContext context) {
        if (context.isLoginSuccess) { // 登录成功
             if (context.attemptEntity != null) {
                 loginAttemptRepository.delete(context.attemptEntity);
                 context.attemptEntity = null;
             }
        }else{ // 登录失败
            if (context.userEntity==null) return;
            if (context.attemptEntity == null) {
                context.attemptEntity = new LoginAttemptEntity();
                context.attemptEntity.setUserId(context.userEntity.getId());
            }
            context.attemptEntity.increaseAttemptCount();
            context.attemptEntity.setLastAttemptTime(LocalDateTime.now());
            loginAttemptRepository.save(context.attemptEntity);
        }

    }

    @Transactional
    public UserEntity login(LoginRO loginRO) throws LoginException {
        var loginContext = new LoginContext(loginRO);
        try {
            checkUserExists(loginContext);
            checkUserLock(loginContext);
            checkCaptcha(loginContext);
            checkPasword(loginContext);
            return loginContext.userEntity;
        }finally {
            updateAttemptEntity(loginContext);
        }
    }

    private static class LoginContext{
        private final LoginRO loginRO;
        private UserEntity userEntity;
        private LoginAttemptEntity attemptEntity;
        private boolean isLoginSuccess;

        LoginContext(LoginRO loginRO){
            this.loginRO = loginRO;
        }
    }

    @Transactional
    public boolean unlockUser(UserEntity user) {
        var attemptEntity = loginAttemptRepository.findByUserId(user.getId());
        if (attemptEntity.isEmpty()) {
            return false;
        }
        loginAttemptRepository.delete(attemptEntity.get());
        return true;
    }
}

