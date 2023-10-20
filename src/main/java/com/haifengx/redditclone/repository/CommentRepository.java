package com.haifengx.redditclone.repository;

import com.haifengx.redditclone.model.Comment;
import com.haifengx.redditclone.model.Post;
import com.haifengx.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 11:12 AM
 * @File : CommentRepository.java
 * @Software : IntelliJ IDEA
 */

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
