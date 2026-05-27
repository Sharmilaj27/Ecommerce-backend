package com.example.backend.service;

import com.example.backend.entity.Review;

import java.util.List;

public interface ReviewService {

    Review addReview(Review review);

    List<Review> getAllReviews();
}