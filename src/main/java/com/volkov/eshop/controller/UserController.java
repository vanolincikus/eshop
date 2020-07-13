package com.volkov.eshop.controller;

import com.volkov.eshop.model.*;
import com.volkov.eshop.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

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
    public User getUser(@PathVariable("userId") Long userId) {

        return userService.getUserById(userId);
    }

    @DeleteMapping("/{userId}")
    public User deleteUser(@PathVariable("userId") Long userId) {
        User user = getUser(userId);

          userService.deleteUser(userId);
            return user;
    }
}
