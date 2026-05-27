package com.example.backend.controller;

import com.example.backend.entity.Cart;
import com.example.backend.entity.CartItem;

import com.example.backend.repository.CartItemRepository;
import com.example.backend.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin("*")

public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @PostMapping
    public Cart createCart(@RequestBody Cart cart) {

        return cartRepository.save(cart);
    }

    @PostMapping("/add")
    public CartItem addToCart(@RequestBody CartItem cartItem) {

        return cartItemRepository.save(cartItem);
    }

    @GetMapping
    public List<Cart> getAllCarts() {

        return cartRepository.findAll();
    }

    @DeleteMapping("/remove/{id}")
    public String removeCartItem(@PathVariable Long id) {

        cartItemRepository.deleteById(id);

        return "Item Removed From Cart";
    }
}