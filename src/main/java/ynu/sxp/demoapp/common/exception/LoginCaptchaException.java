package ynu.sxp.demoapp.common.exception;

import javax.security.auth.login.LoginException;

public class LoginCaptchaException extends LoginException {
    public LoginCaptchaException(String message) {
        super(message);
    }
}

