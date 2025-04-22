package com.example.PAF.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "learning_progress")
public class LearningProgressUpdate {

    @Id
    private String id;

    private String userId;
    private String title;
    private String content;
    private String templateType;

    public String getUserId() {
        return userId;
    }
//    Hello

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getTemplateType() { return templateType; }
    public void setTemplateType(String templateType) { this.templateType = templateType; }
}
