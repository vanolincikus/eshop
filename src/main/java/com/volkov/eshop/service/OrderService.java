package com.volkov.eshop.service;

import com.volkov.eshop.model.*;

import java.util.*;

public interface OrderService {
    void createOrder(Order order);

    void updateOrder();

    List<Order> getAllOrders();

    Order getOrderById(Long orderId);

    void deteleOrder(Long orderId);
}
