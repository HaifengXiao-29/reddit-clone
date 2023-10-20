package com.haifengx.redditclone.service;

import com.haifengx.redditclone.dto.SubredditDto;
import com.haifengx.redditclone.exceptions.SpringRedditException;
import com.haifengx.redditclone.model.Subreddit;
import com.haifengx.redditclone.repository.SubredditRepository;
import com.haifengx.redditclone.mapper.SubredditMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 8/18/23 12:35 PM
 * @File : SubredditService.java
 * @Software : IntelliJ IDEA
 */

@Service
@AllArgsConstructor
@Slf4j
public class SubredditService {

    private final SubredditRepository subredditRepository;
    private final SubredditMapper subredditMapper;
    @Transactional
    public SubredditDto save(SubredditDto subredditDto) {
        Subreddit save = subredditRepository.save(subredditMapper.mapDtoToSubreddit(subredditDto));
        subredditDto.setId(save.getId());
        return subredditDto;
    }

    @Transactional(readOnly = true)
    public List<SubredditDto> getAll() {
        return subredditRepository.findAll()
                .stream()
                .map(subredditMapper::mapSubredditToDto)
                .collect(toList());
    }

    public SubredditDto getSubreddit(Long id) {
        Subreddit subreddit = subredditRepository.findById(id)
                .orElseThrow(() -> new SpringRedditException("No subreddit found with ID -" + id));
        return subredditMapper.mapSubredditToDto(subreddit);
    }

}
