package com.haifengx.redditclone.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 10/19/23 1:48 PM
 * @File : PostRequest.java
 * @Software : IntelliJ IDEA
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PostRequest {
    private Long postId;
    private String subredditName;
    @NotBlank(message = "Post Name cannot be empty or Null")
    private String postName;
    private String url;
    private String description;
}
