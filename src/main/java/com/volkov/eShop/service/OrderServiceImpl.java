package com.volkov.eShop.service;

import com.volkov.eShop.model.*;
import com.volkov.eShop.repository.*;
import org.springframework.stereotype.*;

import java.util.*;
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderReposytory orderReposytory;

    public OrderServiceImpl(OrderReposytory orderReposytory) {
        this.orderReposytory = orderReposytory;
    }

    @Override
    public void createOrder(Order order) {
        orderReposytory.save(order);
    }

    @Override
    public void updateOrder() {

    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public Order getOrderById(Long orderId) {
        return null;
    }

    @Override
    public void deteleOrder(Long orderId) {

    }
}
