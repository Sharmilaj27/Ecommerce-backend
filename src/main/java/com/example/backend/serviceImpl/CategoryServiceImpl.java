package com.example.backend.serviceImpl;

import com.example.backend.entity.Category;
import com.example.backend.repository.CategoryRepository;
import com.example.backend.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {

        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {

        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(Long id) {

        categoryRepository.deleteById(id);
    }
}