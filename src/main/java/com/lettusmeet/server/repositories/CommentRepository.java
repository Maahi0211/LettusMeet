package com.lettusmeet.server.repositories;

import com.lettusmeet.server.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    // Find all comments for a specific post
    List<Comment> findByPostId(String postId);

    // Find all comments by a specific user (if not fully anonymous)
    List<Comment> findByCreatedBy(String createdBy);
}

