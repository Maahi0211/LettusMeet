package com.lettusmeet.server.dtos;

import lombok.Data;

@Data
public class ReactionDTO {
    private String postId;     // ID of the post
    private String userId;     // Optional: User ID who liked/disliked
    private boolean isLike;    // true for like, false for dislike
}
