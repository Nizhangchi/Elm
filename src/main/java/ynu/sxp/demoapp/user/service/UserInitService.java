package ynu.sxp.demoapp.user.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserInitService {

    private final RoleService roleService;
    private final UserService userService;

    public UserInitService(
            RoleService roleService,
            UserService userService
            ) {
        this.roleService = roleService;
        this.userService = userService;
    }

    // 添加内置角色和用户
    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        roleService.addBuildinRoles();
        userService.addBuildinUsers();
    }
}
