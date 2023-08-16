package com.haifengx.redditclone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 10:35 AM
 * @File : Post.java
 * @Software : IntelliJ IDEA
 */
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Post {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long postId;
    
}
