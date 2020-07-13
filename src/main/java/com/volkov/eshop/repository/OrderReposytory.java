package com.volkov.eshop.repository;

import com.volkov.eshop.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderReposytory extends CrudRepository<Order,Long> {
}
