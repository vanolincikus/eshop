package com.volkov.eshop.service;

import com.volkov.eshop.model.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public interface UserService {
    void createUser(User user);

    void updateUser();

    List<User> getAllUsers();

    User getUserById(Long userId);

    void deleteUser(Long userId);
}
