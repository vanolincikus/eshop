package com.volkov.eShop.repository;

import com.volkov.eShop.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderReposytory extends CrudRepository<Order,Long> {
}
