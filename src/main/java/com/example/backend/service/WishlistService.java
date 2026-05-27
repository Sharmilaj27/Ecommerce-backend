package com.example.backend.service;

import com.example.backend.entity.Wishlist;

import java.util.List;

public interface WishlistService {

    Wishlist addWishlist(Wishlist wishlist);

    List<Wishlist> getWishlist();

    void removeWishlist(Long id);
}