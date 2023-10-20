package com.haifengx.redditclone.repository;

import com.haifengx.redditclone.model.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 10/20/23 12:21 PM
 * @File : RefreshTokenRepository.java
 * @Software : IntelliJ IDEA
 */

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}
