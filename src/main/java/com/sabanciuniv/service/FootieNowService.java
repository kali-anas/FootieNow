package com.sabanciuniv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sabanciuniv.model.*;

import repo.CommentRepository;
import repo.MatchRepository;
import repo.NewsRepository;
import repo.UserRepository;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class FootieNowService {
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private UserRepository userRepository;

    // News operations
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public Optional<News> getNewsById(String id) {
        return newsRepository.findById(id);
    }

    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    // Comment operations
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Optional<Comment> getCommentById(String id) {
        return commentRepository.findById(id);
    }

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    // Match operations
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public Optional<Match> getMatchById(String id) {
        return matchRepository.findById(id);
    }

    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    // User operations
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Method to insert sample data - Comment out or remove after testing
    public void insertSampleData() {
        // Adding sample News
        News sampleNews = new News();
        sampleNews.setTitle("New Spring Boot Features");
        sampleNews.setSummary("Explore the latest additions to Spring Boot 2.5.");
        sampleNews.setImageUrl("http://example.com/news.jpg");
        sampleNews.setCreatedAt(LocalDateTime.now());
        saveNews(sampleNews);

        // Adding sample Comment
        Comment sampleComment = new Comment();
        sampleComment.setNews(sampleNews); // linking to the sample news
        sampleComment.setUser(getUserById("123").orElse(null)); // Assuming a user with id '123' exists
        sampleComment.setCommentText("Really excited about these features!");
        sampleComment.setCreatedAt(LocalDateTime.now());
        saveComment(sampleComment);

        // Adding sample Match
        Match sampleMatch = new Match();
        sampleMatch.setDate(LocalDate.now());
        sampleMatch.setTime(LocalTime.now());
        sampleMatch.setTeamA("Team Alpha");
        sampleMatch.setTeamB("Team Beta");
        sampleMatch.setStatus("Scheduled");
        saveMatch(sampleMatch);

        // Adding sample User
        User sampleUser = new User();
        sampleUser.setUsername("testUser");
        sampleUser.setHashedPassword("hashedPassword123");
        sampleUser.setEmail("testuser@example.com");
        saveUser(sampleUser);
    }
}

