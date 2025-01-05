package ynu.sxp.demoapp.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ynu.sxp.demoapp.security.entity.RefreshTokenEntity;

import java.util.Optional;
import java.util.UUID;

// 这是一个用于操作刷新令牌的Repository
public interface IRefreshTokenRepository extends JpaRepository<RefreshTokenEntity, UUID> {
    Optional<RefreshTokenEntity> findByUserId(UUID userId);

    Optional<RefreshTokenEntity> findByRefreshTokenId(UUID refreshTokenId);
}
