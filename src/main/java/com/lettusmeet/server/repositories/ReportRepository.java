package com.lettusmeet.server.repositories;

import com.lettusmeet.server.models.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends MongoRepository<Report, String> {
    // Find all reports for a specific post
    List<Report> findByPostId(String postId);

    // Find all reports created by a specific user (if not fully anonymous)
    List<Report> findByReportedBy(String reportedBy);
}

