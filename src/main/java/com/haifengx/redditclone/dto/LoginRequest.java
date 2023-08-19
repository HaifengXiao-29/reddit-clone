package com.haifengx.redditclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/17/23 4:17 PM
 * @File : LoginRequest.java
 * @Software : IntelliJ IDEA
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

    private String username;
    private String password;
}
