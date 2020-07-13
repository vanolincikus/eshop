package com.volkov.eshop.service;

import com.volkov.eshop.model.*;
import com.volkov.eshop.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Component
public class UserServiceImpl implements UserService {

    private final UserReposytory userReposytory;
    private final AddressReposytory addressReposytory;

    @Autowired
    public UserServiceImpl(UserReposytory userReposytory, AddressReposytory addressReposytory) {
        this.userReposytory = userReposytory;
        this.addressReposytory = addressReposytory;
    }

    @Override
    public void createUser(User user) {

        userReposytory.save(user);


    }

    @Override
    public void updateUser() {

    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userReposytory.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> user = userReposytory.findById(userId);
        if (user.isPresent()) {
            return user.get();
        }
        return null;
    }

    @Override
    public void deleteUser(Long userId) {
        userReposytory.deleteById(userId);

    }

    private void validateUser(User user) {
        if (null == user.getUserAdresses()) {
            throw new IllegalArgumentException("Invalid adress");
        }
    }
}
