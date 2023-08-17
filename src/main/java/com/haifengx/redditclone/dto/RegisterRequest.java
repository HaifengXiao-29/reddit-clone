package com.haifengx.redditclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 12:48 PM
 * @File : RegisterRequest.java
 * @Software : IntelliJ IDEA
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {
    private String email;
    private String username;
    private String password;
}
