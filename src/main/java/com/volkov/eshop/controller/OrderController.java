package com.volkov.eshop.controller;

import com.volkov.eshop.model.*;
import com.volkov.eshop.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        orderService.createOrder(order);
    }
}
