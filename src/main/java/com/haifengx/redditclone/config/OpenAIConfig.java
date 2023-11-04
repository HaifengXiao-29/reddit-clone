package com.haifengx.redditclone.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 11/2/23 7:14 PM
 * @File : OpenAIConfig.java
 * @Software : IntelliJ IDEA
 */

@Configuration
public class OpenAIConfig {

    @Bean
    public OpenAPI expenseAPI() {
        return new OpenAPI()
                .info(new Info().title("Reddit Clone API")
                        .description("API for Reddit Clone Application")
                        .version("v0.0.1")
                        .license(new License().name("Apache License Version 2.0").url("https://github.com/HaifengXiao-29")))
                .externalDocs(new ExternalDocumentation()
                        .description("Expense Tracker Wiki Documentation")
                        .url("https://expensetracker.wiki/docs"));
    }
}
