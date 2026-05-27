package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 5000)
    private String description;

    private Double price;

    private Integer stock;

    private String imageUrl;

    private Double rating;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}