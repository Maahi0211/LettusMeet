package com.lettusmeet.server.dtos;

import lombok.Data;

@Data
public class LoginDTO {
    private String email;    // User's email for login
    private String password; // User's password
}

