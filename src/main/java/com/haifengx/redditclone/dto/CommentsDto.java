package com.haifengx.redditclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 10/20/23 10:17 AM
 * @File : CommentsDto.java
 * @Software : IntelliJ IDEA
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentsDto {
    private Long id;
    private Long postId;
    private Instant createdDate;
    private String text;
    private String userName;
}
