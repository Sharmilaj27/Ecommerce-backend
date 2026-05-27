package com.example.backend.service;

import com.example.backend.entity.Payment;

public interface PaymentService {

    Payment processPayment(Payment payment);
}
