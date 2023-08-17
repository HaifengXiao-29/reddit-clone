package com.haifengx.redditclone.repository;

import com.haifengx.redditclone.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 11:13 AM
 * @File : VerificationTokenRepository.java
 * @Software : IntelliJ IDEA
 */

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);
}
