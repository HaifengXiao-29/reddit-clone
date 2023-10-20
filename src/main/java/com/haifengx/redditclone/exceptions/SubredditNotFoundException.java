package com.haifengx.redditclone.exceptions;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 10/19/23 2:18 PM
 * @File : SubredditNotFoundException.java
 * @Software : IntelliJ IDEA
 */
public class SubredditNotFoundException extends RuntimeException {
    public SubredditNotFoundException(String message) {
        super(message);
    }
}
