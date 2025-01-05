package ynu.sxp.demoapp.user.dto;

import lombok.Data;

import java.util.List;
import java.util.UUID;

/**
 * 用于返回给前端的用户信息
 */
@Data
public class UserVO {
    private UUID id;
    private String code;
    private String name;
    private List<RoleVO> roles;
}
