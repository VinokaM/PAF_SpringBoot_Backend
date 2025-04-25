package com.example.PAF.repository;

import com.example.PAF.model.LearningProgressUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LearningProgressUpdateRepository extends JpaRepository<LearningProgressUpdate, Long> {
    List<LearningProgressUpdate> findByUserId(String userId);
}
