package com.example.backend.service;

import com.example.backend.entity.Orders;

import java.util.List;

public interface OrderService {

    Orders placeOrder(Orders order);

    List<Orders> getAllOrders();

    Orders updateOrderStatus(Long id, Orders order);
}