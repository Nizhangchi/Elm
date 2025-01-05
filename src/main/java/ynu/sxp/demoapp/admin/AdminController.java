package ynu.sxp.demoapp.admin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ynu.sxp.demoapp.admin.dto.*;
import ynu.sxp.demoapp.common.BaseController;
import ynu.sxp.demoapp.security.service.LoginService;
import ynu.sxp.demoapp.user.dto.RoleVO;
import ynu.sxp.demoapp.user.dto.UserVO;
import ynu.sxp.demoapp.user.entity.RoleEntity;
import ynu.sxp.demoapp.user.entity.UserEntity;
import ynu.sxp.demoapp.user.service.RoleService;
import ynu.sxp.demoapp.user.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@PreAuthorize("hasRole('系统管理员')")  // 指出此类只能由管理员角色调用
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "admin", description = "只能由管理员角色调用的接口")
@RequestMapping("/api/admin")
public class AdminController extends BaseController {
    private final RoleService roleService;
    private final LoginService loginService;
    private final UserService userService;


    public AdminController(UserService userService, RoleService roleService, LoginService loginService) {
        this.userService = userService;
        this.roleService = roleService;
        this.loginService = loginService;
    }

    @Operation(summary = "新增用户",description = "新增一个新的用户，每个用户的 code 必须具有唯一性。")
    @PostMapping("user")
    public UserVO addNewUser(@Valid @RequestBody NewUserRO ro) {
        var userEntity = new UserEntity();
        userEntity.setCode(ro.code);
        userEntity.setName(ro.name);
        userEntity.setPassword(ro.password);
        var newUser = this.userService.addUser(userEntity);
        return modelMapper.map(newUser, UserVO.class);
    }

    @Operation(summary = "删除用户",description = "根据用户的 id 删除用户。")
    @DeleteMapping("user/{userId}")
    public boolean deleteUser(@PathVariable UUID userId) {
        this.userService.deleteUserById(userId);
        return true;
    }

    @Operation(summary = "更新用户",description = "更新用户基本信息。")
    @PutMapping("user")
    public UserVO updateUser(@Valid @RequestBody UpdateUserRO ro) {
        UserEntity userEntity = userService.getUserById(ro.id).orElseThrow(()->new RuntimeException("用户不存在"));
        userEntity.setCode(ro.code);
        userEntity.setName(ro.name);
        var updatedUser = this.userService.updateUser(userEntity);
        return modelMapper.map(updatedUser, UserVO.class);
    }

    @Operation(summary = "列出所有用户",description = "列出所有用户")
    @GetMapping("user/list")
    public List<UserVO> listAllUsers() {
        var allUsers = this.userService.getAllUsers();
        return allUsers.stream().map(userEntity -> modelMapper.map(userEntity, UserVO.class)).toList();
    }

    @Operation(summary = "列出所有角色",description = "列出所有角色")
    @GetMapping("role/list")
    public List<RoleVO> listAllRoles() {
        var allRoles = this.roleService.getAllRoles();
        return allRoles.stream().map(roleEntity -> modelMapper.map(roleEntity, RoleVO.class)).toList();
    }

    //add new role
    @Operation(summary = "新增角色",description = "新增一个新的角色，每个角色的 code 必须具有唯一性。")
    @PostMapping("role")
    public RoleVO addNewRole(@Valid @RequestBody NewRoleRO ro) {
        var newRole = this.roleService.addRole(ro.name);
        return modelMapper.map(newRole, RoleVO.class);
    }

    //delete role
    @Operation(summary = "删除角色",description = "根据角色的 id 删除角色。")
    @DeleteMapping("role/{roleId}")
    public boolean deleteRole(@PathVariable UUID roleId) {
        this.roleService.deleteRole(roleId);
        return true;
    }

    //update role
    @Operation(summary = "更新角色",description = "更新角色基本信息。")
    @PutMapping("role")
    public RoleVO updateRole(@Valid @RequestBody UpdateRoleRO ro) {
        var roleEntity = this.roleService.getRoleById(ro.id).orElseThrow(() -> new RuntimeException("角色不存在"));
        roleEntity.setName(ro.name);
        var updatedRole = this.roleService.updateRole(roleEntity);
        return modelMapper.map(updatedRole, RoleVO.class);
    }

    // add role to user
    @Operation(summary = "为用户添加角色",description = "为用户添加角色。")
    @PostMapping("user/role")
    public boolean addRoleToUser(@Valid @RequestBody AddRoleToUserRO ro) {
        this.userService.addRoleToUser(ro.userId, ro.roleId);
        return true;
    }

    // remove role from user
    @Operation(summary = "从用户移除角色",description = "从用户移除角色。")
    @DeleteMapping("user/{userId}/role/{roleId}")
    public boolean removeRoleFromUser(@PathVariable UUID userId, @PathVariable UUID roleId) {
        this.userService.removeRoleFromUser(userId, roleId);
        return true;
    }

    // unlock user
    @Operation(summary = "解锁用户",description = "解锁用户。")
    @PutMapping("user/unlock/{userId}")
    public boolean unlockUser(@PathVariable UUID userId) {
        UserEntity userEntity = userService.getUserById(userId).orElseThrow(() -> new RuntimeException("用户不存在"));
        return this.loginService.unlockUser(userEntity);
    }

}
