package com.example.company.service;

import com.example.company.dto.ProductDTO;
import com.example.company.entities.Product;
import com.example.company.repository.ProductRepository;
import com.googlecode.jmapper.JMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public Product findById(Long id){
        return productRepository.getById(id);
    }
    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }
    public Product save(ProductDTO productDTO){
        JMapper<Product,ProductDTO> resultproductDTOJMapper = new JMapper<>(Product.class,ProductDTO.class);
        Product result = resultproductDTOJMapper.getDestination(productDTO);
        return result;
    }

}
