package com.haifengx.redditclone.repository;

import com.haifengx.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 11:13 AM
 * @File : UserRepository.java
 * @Software : IntelliJ IDEA
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
