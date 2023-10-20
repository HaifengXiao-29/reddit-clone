package com.haifengx.redditclone.repository;

import com.haifengx.redditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 11:12 AM
 * @File : SubredditRepository.java
 * @Software : IntelliJ IDEA
 */

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(String subredditName);
}
