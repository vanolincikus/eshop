package com.volkov.eShop.service;

import com.volkov.eShop.model.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public interface UserService {
    void createUser(User user);

    void updateUser();

    List<User> getAllUsers();

    Optional<User> getUserById(Long userId);

    void deleteUser(Long userId);
}
