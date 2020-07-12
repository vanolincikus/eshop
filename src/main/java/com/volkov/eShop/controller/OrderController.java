package com.volkov.eShop.controller;

import com.volkov.eShop.model.*;
import com.volkov.eShop.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;

@RestController
@RequestMapping("api/orders")
public class OrderController {
    private final OrderService orderService;
@Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping
    public void createOrder(@RequestBody Order order){
    orderService.createOrder(order);
    }
}
