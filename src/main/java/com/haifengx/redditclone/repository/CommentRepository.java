package com.haifengx.redditclone.repository;

import com.haifengx.redditclone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 11:12 AM
 * @File : CommentRepository.java
 * @Software : IntelliJ IDEA
 */

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
