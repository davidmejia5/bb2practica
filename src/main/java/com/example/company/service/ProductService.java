package com.example.company.service;

import com.example.company.dto.ProductDTO;
import com.example.company.entities.Product;

public interface ProductService {
    public Product findById(Long id);
    public void deleteProductById(Long id);
    public Product save(ProductDTO product);
}
