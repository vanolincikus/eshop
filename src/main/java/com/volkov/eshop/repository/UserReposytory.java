package com.volkov.eshop.repository;

import com.volkov.eshop.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposytory extends CrudRepository<User,Long> {
}
