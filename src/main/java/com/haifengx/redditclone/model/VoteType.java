package com.haifengx.redditclone.model;

import com.haifengx.redditclone.exceptions.SpringRedditException;

import java.util.Arrays;

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

    private int direction;

    VoteType(int direction) {
    }

    public static VoteType lookup(Integer direction) {
        return Arrays.stream(VoteType.values())
                .filter(value -> value.getDirection().equals(direction))
                .findAny()
                .orElseThrow(() -> new SpringRedditException("Vote not found"));
    }

    public Integer getDirection() {
        return direction;
    }
}
