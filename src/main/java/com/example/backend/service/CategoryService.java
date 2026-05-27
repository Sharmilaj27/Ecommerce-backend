package com.example.backend.service;
import com.example.backend.entity.Category;

import java.util.List;

public interface CategoryService {

    Category addCategory(Category category);

    List<Category> getAllCategories();

    void deleteCategory(Long id);
}