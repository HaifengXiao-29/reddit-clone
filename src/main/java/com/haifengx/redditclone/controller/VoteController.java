package com.haifengx.redditclone.controller;

import com.haifengx.redditclone.dto.VoteDto;
import com.haifengx.redditclone.service.VoteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 10/20/23 10:46 AM
 * @File : VoteController.java
 * @Software : IntelliJ IDEA
 */


@RestController
@RequestMapping("/api/votes/")
@AllArgsConstructor
public class VoteController {
    private final VoteService voteService;

    @PostMapping
    public ResponseEntity<Void> vote(@RequestBody VoteDto voteDto) {
        voteService.vote(voteDto);
        return new ResponseEntity<>(OK);
    }


}
