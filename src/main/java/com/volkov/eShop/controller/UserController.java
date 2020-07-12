package com.volkov.eShop.controller;

import com.volkov.eShop.model.*;
import com.volkov.eShop.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);

    }

    @PutMapping
    public void updateUser(@RequestBody User user) {

    }

    @GetMapping
    public Iterable<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable("userId") Long userId) {
        return userService.getUserById(userId);
    }

    @DeleteMapping("/{userId}")
    public Optional<User> deleteUser(@PathVariable("userId") Long userId) {
        Optional<User> user = getUser(userId);
        try {
            userService.deleteUser(userId);
            user.get().setStatus("ok");
        } catch (Exception e) {
            user.get().setStatus("delete error");
        }
        return user;
    }
}
