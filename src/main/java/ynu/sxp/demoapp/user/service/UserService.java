package ynu.sxp.demoapp.user.service;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ynu.sxp.demoapp.user.entity.RoleEntity;
import ynu.sxp.demoapp.user.entity.UserEntity;
import ynu.sxp.demoapp.user.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, RoleService roleService) {
        this.userRepository = userRepository;
        this.roleService = roleService;
        this.passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Transactional
    public UserEntity addUser(UserEntity userEntity) {
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
        return userRepository.save(userEntity);
    }

    @Transactional
    public void deleteUser(UserEntity userEntity) {
        // cant delete admin user
        if (userEntity.getCode().equals("admin")) {
            throw new RuntimeException("不能删除管理员用户！");
        }
        userRepository.delete(userEntity);
    }

    public void deleteUserById(UUID id) {
        Optional<UserEntity> userEntity = userRepository.findById(id);
        userEntity.ifPresent(this::deleteUser);
    }

    @Transactional
    public UserEntity updateUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserById(UUID id) {
        return userRepository.findById(id);
    }

    public Optional<UserEntity> getUserByCode(String code) {
        return userRepository.findByCode(code);
    }

    // 添加内置用户
    @Transactional
    public void addBuildinUsers() {
        // 如果用户表中有数据，说明已经初始化过了
        if (userRepository.count()>0) return;

        UserEntity userEntity = new UserEntity();
        userEntity.setCode("admin");
        userEntity.setName("系统管理员");
        userEntity.setPassword("admin");
        // add admin role
        RoleEntity roleEntity = roleService.getRoleByName("系统管理员").get();
        userEntity.getRoles().add(roleEntity);
        this.addUser(userEntity);
    }


    // 校验用户密码
    public boolean validateUserPassword(UserEntity userEntity, String password) {
        return passwordEncoder.matches(password, userEntity.getPassword());
    }

    // 修改密码
    @Transactional
    public void changePassword(UserEntity user, String newPassword) {
        user.setPassword(passwordEncoder.encode(newPassword));
        userRepository.save(user);
    }

    @Transactional
    public void addRoleToUser(UUID userId, UUID roleId) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("用户不存在"));
        RoleEntity roleEntity = roleService.getRoleById(roleId).orElseThrow(() -> new RuntimeException("角色不存在"));
        userEntity.getRoles().add(roleEntity);
        userRepository.save(userEntity);
    }

    @Transactional
    public void removeRoleFromUser(UUID userId, UUID roleId) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("用户不存在"));
        RoleEntity roleEntity = roleService.getRoleById(roleId).orElseThrow(() -> new RuntimeException("角色不存在"));
        userEntity.getRoles().remove(roleEntity);
        userRepository.save(userEntity);
    }
}


