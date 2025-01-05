package ynu.sxp.demoapp.security.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import ynu.sxp.demoapp.captcha.dto.CaptchaRO;
import ynu.sxp.demoapp.common.TrimString;


@Schema(description = "登录时提交的请求体")
public class LoginRO {
    @Schema(description = "用户登录名", example = "admin")
    @NotEmpty
    @JsonDeserialize(using = TrimString.class)
    public String username;

    @Schema(description = "登录密码", example = "123456")
    @NotEmpty
    public String password;

    @Schema(description = "验证码")
    public CaptchaRO captcha;
}

