package com.lettusmeet.server.services;

import com.lettusmeet.server.configs.jwt.JwtUtil;
import com.lettusmeet.server.dtos.RegisterDTO;
import com.lettusmeet.server.models.User;
import com.lettusmeet.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtUtil jwtUtil;

    public Map<String, String> register(RegisterDTO registerDTO){
        Optional<User> isUserPresent =userRepository.findByEmail(registerDTO.getEmail());
        if(isUserPresent.isPresent()){
            throw new IllegalArgumentException("Email already exists");
        }
        User user = new User();
        user.setUsername(registerDTO.getUsername());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());

        User savedUser = userRepository.save(user);
        String token =jwtUtil.generateToken(savedUser);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        response.put("message", "User registered successfully");
        return response;
    }



    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

}
