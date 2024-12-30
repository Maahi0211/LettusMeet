package com.lettusmeet.server.models;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "posts")
public class Post {
    @Id
    private String id;
    private String content;
    private LocalDateTime createdAt = LocalDateTime.now();
    private boolean isAnonymous = true;
    private String createdBy;
    private int likes = 0;
    private int dislikes = 0;
}
