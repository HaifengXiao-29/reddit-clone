package com.haifengx.redditclone.model;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 11:10 AM
 * @File : VoteType.java
 * @Software : IntelliJ IDEA
 */
public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1),
    ;

    VoteType(int direction) {

    }
}
