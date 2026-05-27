package com.example.backend.service;

import com.example.backend.entity.Cart;
import com.example.backend.entity.CartItem;

import java.util.List;

public interface CartService {

    Cart createCart(Cart cart);

    CartItem addToCart(CartItem cartItem);

    List<Cart> getAllCarts();

    void removeCartItem(Long id);
}
