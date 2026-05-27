package com.example.backend.controller;

import com.example.backend.entity.Payment;
import com.example.backend.repository.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin("*")

public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @PostMapping("/process")
    public Payment processPayment(@RequestBody Payment payment) {

        payment.setTransactionId(UUID.randomUUID().toString());

        payment.setPaymentStatus("SUCCESS");

        return paymentRepository.save(payment);
    }
}