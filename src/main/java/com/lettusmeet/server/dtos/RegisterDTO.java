package com.lettusmeet.server.dtos;

import lombok.Data;

@Data
public class RegisterDTO {
    private String username; // Desired username (alias)
    private String email;    // User's email
    private String password; // User's password
}

