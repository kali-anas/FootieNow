package com.sabanciuniv.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "comments")
public class Comment {
    @Id
    private String id;
    @DBRef
    private News news;
    @DBRef
    private User user;
    private String commentText;
    private LocalDateTime createdAt;

    // Getters
    public String getId() {
        return id;
    }

    public News getNews() {
        return news;
    }

    public User getUser() {
        return user;
    }

    public String getCommentText() {
        return commentText;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
