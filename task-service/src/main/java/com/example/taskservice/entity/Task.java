package com.example.taskservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String status;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    // Default constructor (required)
    public Task() {}

    // Parameterized constructor
    public Task(String title, String status, Long userId) {
        this.title = title;
        this.status = status;
        this.userId = userId;
    }

    // Getters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
    public Long getUserId() { return userId; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setStatus(String status) { this.status = status; }
    public void setUserId(Long userId) { this.userId = userId; }
}