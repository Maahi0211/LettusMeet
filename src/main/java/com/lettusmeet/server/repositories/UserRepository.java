package com.lettusmeet.server.repositories;

import com.lettusmeet.server.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Example: Find user by username
    Optional<User> findByUsername(String username);

    Optional<User> isBanned(String id);

    // Example: Check if email exists
    Optional<User> findByEmail(String email);
}

