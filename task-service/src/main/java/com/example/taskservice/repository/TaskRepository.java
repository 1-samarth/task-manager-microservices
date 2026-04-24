package com.example.taskservice.repository;

import com.example.taskservice.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    // Get all tasks by userId
    List<Task> findByUserId(Long userId);
}