package com.lettusmeet.server.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "reactions")
public class Reaction {
    @Id
    private String id;
    private String postId;
    private String userId;
    private boolean isLike;
}

