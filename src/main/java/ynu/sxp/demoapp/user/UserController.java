package ynu.sxp.demoapp.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import ynu.sxp.demoapp.common.BaseController;
import ynu.sxp.demoapp.user.dto.ChangePasswordRO;
import ynu.sxp.demoapp.user.dto.UserVO;
import ynu.sxp.demoapp.user.entity.UserEntity;
import ynu.sxp.demoapp.user.service.UserService;

@RestController
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "User", description = "用户相关" )
@RequestMapping("/api/user")

public class UserController extends BaseController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    private UserEntity getCurrentUser() {
        return userService.getUserById(getCurrentUserId()).orElseThrow(() -> new RuntimeException("用户不存在！"));
    }
    @GetMapping("info")
    @Operation(summary = "获取当前用户信息", description = "获取当前调用此接口的用户基本信息")
    public UserVO getUserInfo() {
        var user = getCurrentUser();
        return modelMapper.map(user, UserVO.class);
    }

    @PutMapping("password")
    @Operation(summary = "修改当前用户密码", description = "修改当前用户密码")
    public boolean changePassword(@Valid @RequestBody ChangePasswordRO ro) {
        var user = getCurrentUser();
        Assert.isTrue(userService.validateUserPassword(user, ro.getOldPassword()), "密码错误!");
        userService.changePassword(user, ro.getNewPassword());
        return true;
    }

}
