package com.haifengx.redditclone.exceptions;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/16/23 12:04 PM
 * @File : SpringRedditException.java
 * @Software : IntelliJ IDEA
 */
public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exMessage) {
        super(exMessage);
    }
}
