package com.haifengx.redditclone.repository;

import com.haifengx.redditclone.model.Post;
import com.haifengx.redditclone.model.User;
import com.haifengx.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 11:13 AM
 * @File : VoteRepository.java
 * @Software : IntelliJ IDEA
 */

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
