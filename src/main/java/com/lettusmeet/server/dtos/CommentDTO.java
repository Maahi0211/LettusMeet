package com.lettusmeet.server.dtos;

import lombok.Data;

@Data
public class CommentDTO {
    private String id;
    private String postId;       // The post this comment belongs to
    private String content;      // Comment content
    private String createdAt;    // Timestamp (formatted as needed)
    private String createdBy;    // Optional: User ID or alias
}

