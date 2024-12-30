package com.lettusmeet.server.dtos;

import lombok.Data;

@Data
public class PostDTO {
    private String id;
    private String content;                  // Post content
    private String createdAt;               // Date/time as a String (can be formatted if needed)
    private boolean isAnonymous;            // Is the post anonymous?
    private int likes;                      // Total likes
    private int dislikes;                   // Total dislikes
}
