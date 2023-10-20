package com.haifengx.redditclone.repository;

import com.haifengx.redditclone.model.Post;
import com.haifengx.redditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.haifengx.redditclone.model.User;

import java.util.List;


/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 11:12 AM
 * @File : PostRepository.java
 * @Software : IntelliJ IDEA
 */

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);
    List<Post> findByUser(User user);
}
