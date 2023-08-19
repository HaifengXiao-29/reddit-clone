package com.haifengx.redditclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/17/23 4:39 PM
 * @File : AuthenticationResponse.java
 * @Software : IntelliJ IDEA
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String authenticationToken;
    private String username;
}
