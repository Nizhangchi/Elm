package ynu.sxp.demoapp.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ynu.sxp.demoapp.user.entity.RoleEntity;
import ynu.sxp.demoapp.user.repository.RoleRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    /**
     * 添加角色
     * @param roleName 角色名称
     * @return 角色实体
     */
    @Transactional
    public RoleEntity   addRole(String roleName) {
        var roleEntity = new RoleEntity();
        roleEntity.setName(roleName);
        return roleRepository.save(roleEntity);
    }

    /**
     * 删除角色
     * @param roleId 角色id
     */
    @Transactional
    public void deleteRole(UUID roleId) {
        roleRepository.deleteById(roleId);
    }

    /**
     * 更新角色
     * @param roleEntity 角色实体
     */
    @Transactional
    public RoleEntity updateRole(RoleEntity roleEntity) {
        return roleRepository.save(roleEntity);
    }

    /**
     * 获取所有角色
     * @return 角色实体列表
     */
    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }

    /**
     * 通过角色id获取角色
     * @param roleId 角色id
     * @return 角色实体
     */
    public Optional<RoleEntity> getRoleById(UUID roleId) {
        return roleRepository.findById(roleId);
    }

    /**
     * 通过角色名称获取角色
     * @param name 角色名称
     * @return 角色实体
     */
    public Optional<RoleEntity> getRoleByName(String name) {
        return roleRepository.findByName(name);
    }

    // 添加内置角色
    @Transactional
    public void addBuildinRoles() {

        if (roleRepository.count()>0) return;

        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setName("系统管理员");
        roleRepository.save(roleEntity);

        roleEntity = new RoleEntity();
        roleEntity.setName("学生");
        roleRepository.save(roleEntity);

        // add teacher role
        roleEntity = new RoleEntity();
        roleEntity.setName("教师");
        roleRepository.save(roleEntity);
    }

}
