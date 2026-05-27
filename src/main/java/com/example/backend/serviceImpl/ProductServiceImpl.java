package com.example.backend.serviceImpl;

import com.example.backend.entity.Product;
import com.example.backend.repository.ProductRepository;
import com.example.backend.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {

        return productRepository.findById(id).orElseThrow();
    }

    @Override
    public Product updateProduct(Long id, Product updatedProduct) {

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

    @Override
    public void deleteProduct(Long id) {

        productRepository.deleteById(id);
    }
}