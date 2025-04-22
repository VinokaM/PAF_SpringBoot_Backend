package com.example.PAF.service;

import com.example.PAF.model.LearningProgressUpdate;
import com.example.PAF.repository.LearningProgressUpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningProgressUpdateService {

    @Autowired
    private LearningProgressUpdateRepository repository;

    public LearningProgressUpdate createUpdate(LearningProgressUpdate update) {
        return repository.save(update);
    }

    public List<LearningProgressUpdate> getUpdatesByUser(String userId) {
        return repository.findByUserId(userId);
    }

    public LearningProgressUpdate updateProgress(String id, LearningProgressUpdate updated) {
        LearningProgressUpdate existing = repository.findById(id).orElseThrow();
        existing.setTitle(updated.getTitle());
        existing.setContent(updated.getContent());
        existing.setTemplateType(updated.getTemplateType());
        return repository.save(existing);
    }

    public void deleteProgress(String id) {
        repository.deleteById(id);
    }
}
