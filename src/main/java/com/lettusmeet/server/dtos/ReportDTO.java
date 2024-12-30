package com.lettusmeet.server.dtos;

import lombok.Data;

@Data
public class ReportDTO {
    private String id;
    private String postId;       // ID of the post being reported
    private String reason;       // Reason for reporting (e.g., "Spam", "Hate speech")
    private String reportedBy;   // Optional: ID of the reporter
    private String reportedAt;   // Timestamp (formatted)
}

