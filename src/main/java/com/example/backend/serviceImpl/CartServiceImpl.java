package com.example.backend.serviceImpl;
import com.example.backend.entity.Cart;
import com.example.backend.entity.CartItem;

import com.example.backend.repository.CartItemRepository;
import com.example.backend.repository.CartRepository;
import com.example.backend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Override
    public Cart createCart(Cart cart) {

        return cartRepository.save(cart);
    }

    @Override
    public CartItem addToCart(CartItem cartItem) {

        return cartItemRepository.save(cartItem);
    }

    @Override
    public List<Cart> getAllCarts() {

        return cartRepository.findAll();
    }

    @Override
    public void removeCartItem(Long id) {

        cartItemRepository.deleteById(id);
    }
}
