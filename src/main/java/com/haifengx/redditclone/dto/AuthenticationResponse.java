package com.haifengx.redditclone.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

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
@Builder
public class AuthenticationResponse {
    private String authenticationToken;
    private String refreshToken;
    private Instant expiresAt;
    private String username;
}
