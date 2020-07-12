package com.volkov.eShop.repository;

import com.volkov.eShop.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposytory extends CrudRepository<User,Long> {
}
