package com.lettusmeet.server.dtos;

import lombok.Data;

@Data
public class CreateCommentRequestDTO {
    private String postId;     // The post ID this comment belongs to
    private String content;    // Comment text
}

