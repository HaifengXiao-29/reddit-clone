package com.haifengx.redditclone;

import com.haifengx.redditclone.config.OpenAIConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import java.time.Instant;
import java.time.ZoneId;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/14/23 12:32 PM
 * @File : RedditCloneApplication.java
 * @Software : IntelliJ IDEA
 */

@SpringBootApplication
@EnableAsync
@Import(OpenAIConfig.class)
public class RedditCloneApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedditCloneApplication.class, args);
    }
}
