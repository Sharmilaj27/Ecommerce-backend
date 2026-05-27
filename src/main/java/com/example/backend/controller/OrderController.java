package com.example.backend.controller;

import com.example.backend.entity.Orders;
import com.example.backend.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin("*")

public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Orders placeOrder(@RequestBody Orders order) {

        order.setCreatedAt(LocalDateTime.now());
        order.setStatus("PENDING");
        order.setPaymentStatus("UNPAID");

        return orderRepository.save(order);
    }

    @GetMapping
    public List<Orders> getAllOrders() {

        return orderRepository.findAll();
    }

    @PutMapping("/{id}")
    public Orders updateOrderStatus(@PathVariable Long id,
                                    @RequestBody Orders updatedOrder) {

        Orders order =
                orderRepository.findById(id).orElseThrow();

        order.setStatus(updatedOrder.getStatus());

        return orderRepository.save(order);
    }
}
