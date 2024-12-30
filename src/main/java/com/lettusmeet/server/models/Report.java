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
@Document(collection = "reports")
public class Report {
    @Id
    private String id;
    private String postId;
    private String reason;
    private LocalDateTime reportedAt = LocalDateTime.now();
    private String reportedBy;
}

