package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllUsers() {
        logger.debug("GET /api/users çağrıldı");
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        logger.debug("GET /api/users/{} çağrıldı", id);
        return service.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        logger.debug("POST /api/users çağrıldı, user: {}", user);
        return service.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        logger.debug("PUT /api/users/{} çağrıldı, user: {}", id, user);
        return service.updateUser(id, user);
    }
}
