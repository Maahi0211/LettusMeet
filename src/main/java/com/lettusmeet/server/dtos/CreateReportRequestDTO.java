package com.lettusmeet.server.dtos;

import lombok.Data;

@Data
public class CreateReportRequestDTO {
    private String postId;     // ID of the post being reported
    private String reason;     // Reason for reporting
}

