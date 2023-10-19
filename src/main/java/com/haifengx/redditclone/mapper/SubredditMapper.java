package com.haifengx.redditclone.mapper;

import com.haifengx.redditclone.dto.SubredditDto;
import com.haifengx.redditclone.model.Post;
import com.haifengx.redditclone.model.Subreddit;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 10/2/23 1:52 PM
 * @File : SubredditMapper.java
 * @Software : IntelliJ IDEA
 */
@Mapper(componentModel = "spring")
public interface SubredditMapper {

    @Mapping(target = "numberOfPosts", expression = "java(mapPosts(subreddit.getPosts()))")
    SubredditDto mapSubredditToDto(Subreddit subreddit);

    default Integer mapPosts(List<Post> numberOfPosts) {
        return numberOfPosts.size();
    }

    @InheritInverseConfiguration
    @Mapping(target = "posts", ignore = true)
    Subreddit mapDtoToSubreddit(SubredditDto subredditDto);
}