package com.example.backend.service;

import com.example.backend.entity.Coupon;

import java.util.List;

public interface CouponService {

    Coupon addCoupon(Coupon coupon);

    List<Coupon> getAllCoupons();

    void deleteCoupon(Long id);
}
