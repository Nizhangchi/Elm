package ynu.sxp.demoapp.security;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ynu.sxp.demoapp.security.dto.LoginRO;
import ynu.sxp.demoapp.security.dto.TokenVO;
import ynu.sxp.demoapp.security.service.JwkService;
import ynu.sxp.demoapp.security.service.LoginService;
import ynu.sxp.demoapp.security.service.TokenService;

import javax.security.auth.login.LoginException;
import java.util.Map;
import java.util.UUID;

@RestController
@Tag(name = "Auth", description = "与身份认证相关的接口" )
public class AuthController {

    private final LoginService loginService;
    private final TokenService tokenService;
    private final JwkService jwkService;

    public AuthController(LoginService loginService, TokenService tokenService, JwkService jwkService) {
        this.loginService = loginService;
        this.tokenService = tokenService;
        this.jwkService = jwkService;
    }

    @GetMapping("/auth/jwk")
    @Operation(summary = "获取公钥", description = "用于获取验证令牌数字签名的公钥")
    public Map<String, Object> GetJwk(){
        return this.jwkService.jwkSet().toJSONObject();
    }

    @PostMapping("/auth/login")
    @Operation(summary = "登录", description = "通过用户代码和密码登录获取令牌")
    public TokenVO login(@Valid @RequestBody LoginRO ro) throws LoginException {
        var user = loginService.login(ro);
        return tokenService.generateToken(user);
    }

    @PostMapping("/auth/refresh")
    @Operation(summary = "换发新令牌", description = "用刷新令牌换发新的访问令牌")
    public TokenVO refresh(@RequestBody UUID refreshTokenId) {
        return tokenService.refreshToken(refreshTokenId);
    }

}
