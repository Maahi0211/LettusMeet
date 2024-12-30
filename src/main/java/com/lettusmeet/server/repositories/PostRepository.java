package com.lettusmeet.server.repositories;

import com.lettusmeet.server.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    // Find all posts ordered by creation time (most recent first)
    List<Post> findAllByOrderByCreatedAtDesc();

    // Find all posts created by a specific user (if not fully anonymous)
    List<Post> findByCreatedBy(String createdBy);
}

