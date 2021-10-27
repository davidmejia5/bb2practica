package com.example.company.service;

import com.example.company.dto.ProductDTO;
import com.example.company.entities.Product;

import java.util.List;

public interface ProductService {
    public ProductDTO findById(Long id);
    public void deleteProductById(Long id);
    public Product save(ProductDTO product);
    public List<ProductDTO> findAllProduct();
}
