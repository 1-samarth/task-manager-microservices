package com.example.userservice.controller;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable("id") Long id) {
        if (userRepository.existsById(id)) {
            return ResponseEntity.ok(userRepository.findById(id).get());
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "User not found"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Long id, @RequestBody User updatedUser) {
        if (userRepository.existsById(id)) {
            User user = userRepository.findById(id).get();

            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());

            User saved = userRepository.save(user);
            return ResponseEntity.ok(saved);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "User not found"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Long id) {
        if (!userRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "User not found"));
        }

        userRepository.deleteById(id);
        return ResponseEntity.ok(Map.of("message", "User deleted successfully"));
    }
}