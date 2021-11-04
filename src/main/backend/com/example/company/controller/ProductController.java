package com.example.company.controller;

import com.example.company.dto.ProductDTO;
import com.example.company.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<ProductDTO> getAllProduct(){
        return productService.findAllProduct();
    }
    @GetMapping("/products/{id}")
    public ProductDTO getProductById(@PathVariable Long id){
        return productService.findById(id);
    }
    @PostMapping("/products/delete/{id}")
    public void deleteProduct(@PathVariable Long id){  productService.deleteProductById(id);}
    @PostMapping("/produts/add/{}")
    public void addProduct(@PathVariable Long id) {

        //productService.save()
    }
}
