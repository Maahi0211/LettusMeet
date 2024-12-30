package com.lettusmeet.server.repositories;

import com.lettusmeet.server.models.Reaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReactionRepository extends MongoRepository<Reaction, String> {
    // Find all reactions for a specific post
    List<Reaction> findByPostId(String postId);

    // Find reactions for a specific post by a specific user
    List<Reaction> findByPostIdAndUserId(String postId, String userId);
}