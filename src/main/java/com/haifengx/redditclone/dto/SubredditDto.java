package com.haifengx.redditclone.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/18/23 12:33 PM
 * @File : SubredditDto.java
 * @Software : IntelliJ IDEA
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubredditDto {
    private Long id;
    private String name;
    private String description;
    private Integer numberOfPosts;
}
