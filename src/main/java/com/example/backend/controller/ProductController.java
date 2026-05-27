package com.example.backend.controller;

import com.example.backend.entity.Product;
import com.example.backend.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")

public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {

        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {

        return productRepository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,
                                 @RequestBody Product updatedProduct) {

        Product product =
                productRepository.findById(id).orElseThrow();

        product.setName(updatedProduct.getName());
        product.setDescription(updatedProduct.getDescription());
        product.setPrice(updatedProduct.getPrice());
        product.setStock(updatedProduct.getStock());
        product.setImageUrl(updatedProduct.getImageUrl());
        product.setRating(updatedProduct.getRating());

        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {

        productRepository.deleteById(id);

        return "Product Deleted Successfully";
    }
}