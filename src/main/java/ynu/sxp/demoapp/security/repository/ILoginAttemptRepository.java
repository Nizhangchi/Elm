package ynu.sxp.demoapp.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ynu.sxp.demoapp.security.entity.LoginAttemptEntity;

import java.util.Optional;
import java.util.UUID;

// 这是一个用于操作登录锁定信息的Repository
public interface ILoginAttemptRepository extends JpaRepository<LoginAttemptEntity, UUID> {
    Optional<LoginAttemptEntity> findByUserId(UUID userId);

    void deleteByUserId(UUID userId);
}
