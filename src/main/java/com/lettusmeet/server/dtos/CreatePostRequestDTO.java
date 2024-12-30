package com.lettusmeet.server.dtos;

import lombok.Data;

@Data
public class CreatePostRequestDTO {
    private String content;    // Post content (required)
    private boolean isAnonymous; // Optional: Set to true if the post is anonymous
}