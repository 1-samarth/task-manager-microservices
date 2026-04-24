package com.example.taskservice.controller;

import com.example.taskservice.entity.Task;
import com.example.taskservice.repository.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "*")
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        Task savedTask = taskRepository.save(task);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getTaskById(@PathVariable("id") Long id) {
        if (taskRepository.existsById(id)) {
            return ResponseEntity.ok(taskRepository.findById(id).get());
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "Task not found"));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Task>> getTasksByUserId(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(taskRepository.findByUserId(userId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateTask(@PathVariable("id") Long id, @RequestBody Task updatedTask) {
        if (taskRepository.existsById(id)) {
            Task task = taskRepository.findById(id).get();

            task.setTitle(updatedTask.getTitle());
            task.setStatus(updatedTask.getStatus());
            task.setUserId(updatedTask.getUserId());

            Task savedTask = taskRepository.save(task);
            return ResponseEntity.ok(savedTask);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "Task not found"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTask(@PathVariable("id") Long id) {
        if (!taskRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Task not found"));
        }

        taskRepository.deleteById(id);
        return ResponseEntity.ok(Map.of("message", "Task deleted successfully"));
    }
}