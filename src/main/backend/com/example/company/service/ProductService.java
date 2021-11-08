package com.example.company.service;

import com.example.company.dto.ProductDTO;
import com.example.company.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public ProductDTO findById(Long id);
    public void deleteProductById(Long id);
    public Optional<Product> update(ProductDTO product);
    public List<ProductDTO> findAllProduct();
    public void changeState(Long id);
}
