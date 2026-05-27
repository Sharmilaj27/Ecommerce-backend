package com.example.backend.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer quantity;

    private Double price;
}
