package com.example.backend.repository;

import com.example.backend.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository
        extends JpaRepository<Wishlist, Long> {
}
