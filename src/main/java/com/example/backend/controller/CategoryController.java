package com.example.backend.controller;

import com.example.backend.entity.Category;
import com.example.backend.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin("*")

public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping
    public Category addCategory(@RequestBody Category category) {

        return categoryRepository.save(category);
    }

    @GetMapping
    public List<Category> getAllCategories() {

        return categoryRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id) {

        categoryRepository.deleteById(id);

        return "Category Deleted";
    }
}