package com.lettusmeet.server.controllers;

import com.lettusmeet.server.dtos.LoginDTO;
import com.lettusmeet.server.dtos.RegisterDTO;
import com.lettusmeet.server.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody RegisterDTO registerDTO){
        try{
            Map<String, String> response=userService.register(registerDTO);
            return ResponseEntity.ok(response);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
