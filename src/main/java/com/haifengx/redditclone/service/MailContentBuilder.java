package com.haifengx.redditclone.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/16/23 11:49 AM
 * @File : MailContentBuilder.java
 * @Software : IntelliJ IDEA
 */

@Service
@AllArgsConstructor
public class MailContentBuilder {

    private final TemplateEngine templateEngine;
    String build(String message) {
        Context context = new Context();
        context.setVariable("message", message);
        return templateEngine.process("mailTemplate", context);
    }
}
