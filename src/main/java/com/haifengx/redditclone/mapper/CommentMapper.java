package com.haifengx.redditclone.mapper;

import com.haifengx.redditclone.dto.CommentsDto;
import com.haifengx.redditclone.model.Comment;
import com.haifengx.redditclone.model.Post;
import com.haifengx.redditclone.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Haifeng Xiao
 * @version : 1.0
 * @date 10/20/23 10:23 AM
 * @File : CommentMapper.java
 * @Software : IntelliJ IDEA
 */

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "text", source = "commentsDto.text")
    @Mapping(target = "createDate", expression = "java(java.time.Instant.now())")
    Comment map(CommentsDto commentsDto, Post post, User user);

    @Mapping(target = "postId", expression = "java(comment.getPost().getPostId())")
    @Mapping(target = "userName", expression = "java(comment.getUser().getUsername())")
    CommentsDto mapToDto(Comment comment);

}
