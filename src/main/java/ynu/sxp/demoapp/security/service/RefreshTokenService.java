package ynu.sxp.demoapp.security.service;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;
import ynu.sxp.demoapp.security.entity.RefreshTokenEntity;
import ynu.sxp.demoapp.security.repository.IRefreshTokenRepository;
import ynu.sxp.demoapp.user.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class RefreshTokenService {
    private final IRefreshTokenRepository refreshTokenRepository;

    RefreshTokenService(IRefreshTokenRepository refreshTokenRepository) {
        this.refreshTokenRepository = refreshTokenRepository;
    }

    // 为给出的用户分配一个刷新令牌Id
    public UUID assignRefreshTokenId(UserEntity user) {
        var refreshTokenEntity =  refreshTokenRepository.findByUserId(user.getId())
                .orElseGet(() -> this.createRefreshToken(user));
        updateRefreshToken(refreshTokenEntity);
        return refreshTokenEntity.getRefreshTokenId();
    }

    // 用给出的刷新令牌Id 获得拥有此令牌的用户Id
    public UUID getUserId(UUID refreshTokenId) {
        var refreshTokenEntity = refreshTokenRepository.findByRefreshTokenId(refreshTokenId)
                .orElseThrow(() -> new BadCredentialsException("无效的刷新令牌！"));
        return refreshTokenEntity.getUserId();
    }

    // 为给出的用户创建一个新的 RefreshTokenEntity 对象
    private RefreshTokenEntity createRefreshToken(UserEntity user) {
        RefreshTokenEntity refreshTokenEntity = new RefreshTokenEntity();
        refreshTokenEntity.setUserId(user.getId());
        return refreshTokenEntity;
    }

    // 更新并保存 RefreshTokenEntity 对象
    private void updateRefreshToken(RefreshTokenEntity refreshTokenEntity) {
        // 获取当前请求对象
        refreshTokenEntity.setRefreshTokenId(UUID.randomUUID());
        refreshTokenEntity.setRefreshTime(LocalDateTime.now());
        refreshTokenRepository.save(refreshTokenEntity);
    }


}
