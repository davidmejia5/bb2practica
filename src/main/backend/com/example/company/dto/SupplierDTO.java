package com.example.company.dto;

import com.example.company.entities.Product;
import com.example.company.entities.Supplier;

import java.util.ArrayList;
import java.util.List;

public class SupplierDTO {
    private Long id;
    private String name;
    List<ProductDTO> products = new ArrayList<>();
    private CountryDTO countryDTO;

    public SupplierDTO(Supplier supplier){
        this.id = supplier.getId();
        this.name = supplier.getName();
        this.countryDTO = new CountryDTO(supplier.getCountry());
        for(Product product : supplier.getProducts()){
            this.products.add(new ProductDTO(product));
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    public CountryDTO getCountryDTO() {
        return countryDTO;
    }

    public void setCountryDTO(CountryDTO countryDTO) {
        this.countryDTO = countryDTO;
    }
}
