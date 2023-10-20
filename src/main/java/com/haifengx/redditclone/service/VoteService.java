package com.haifengx.redditclone.service;

import com.haifengx.redditclone.dto.VoteDto;
import com.haifengx.redditclone.exceptions.PostNotFoundException;
import com.haifengx.redditclone.exceptions.SpringRedditException;
import com.haifengx.redditclone.model.Post;
import com.haifengx.redditclone.model.Vote;
import com.haifengx.redditclone.repository.PostRepository;
import com.haifengx.redditclone.repository.VoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static com.haifengx.redditclone.model.VoteType.UPVOTE;


/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 10/20/23 11:24 AM
 * @File : VoteService.java
 * @Software : IntelliJ IDEA
 */

@Service
@AllArgsConstructor
public class VoteService {

    private final VoteRepository voteRepository;
    private final PostRepository postRepository;
    private final AuthService authService;

    @Transactional
    public void vote(VoteDto voteDto) {
        Post post = postRepository.findById(voteDto.getPostId())
                .orElseThrow(() -> new PostNotFoundException("Post Not Found with ID - " + voteDto.getPostId()));
        Optional<Vote> voteByPostAndUser = voteRepository.findTopByPostAndUserOrderByVoteIdDesc(post, authService.getCurrentUser());
        if (voteByPostAndUser.isPresent() &&
                voteByPostAndUser.get().getVoteType()
                        .equals(voteDto.getVoteType())) {
            throw new SpringRedditException("You have already "
                    + voteDto.getVoteType() + "'d for this post");
        }
        if (UPVOTE.equals(voteDto.getVoteType())) {
            post.setVoteCount(post.getVoteCount() + 1);
        } else {
            post.setVoteCount(post.getVoteCount() - 1);
        }
        voteRepository.save(mapToVote(voteDto, post));
        postRepository.save(post);
    }

    private Vote mapToVote(VoteDto voteDto, Post post) {
        return Vote.builder()
                .voteType(voteDto.getVoteType())
                .post(post)
                .user(authService.getCurrentUser())
                .build();
    }
}
