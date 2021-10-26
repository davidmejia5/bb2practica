package com.example.company.dto;

import com.example.company.enums.ProductState;
import com.googlecode.jmapper.annotations.JMap;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

    private Long id;
    @JMap
    private String description;
    @JMap
    private double price;
    @JMap
    private ProductState productState = ProductState.ACTIVE;
    @JMap
    private Date creationDate;
    @JMap
    private List<SupplierDTO> supplierDTOList = new ArrayList();
    @JMap
    private PriceReductionDTO priceReductionDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductState getProductState() {
        return productState;
    }

    public void setProductState(ProductState productState) {
        this.productState = productState;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<SupplierDTO> getSupplierDTOList() {
        return supplierDTOList;
    }

    public void setSupplierDTOList(List<SupplierDTO> supplierDTOList) {
        this.supplierDTOList = supplierDTOList;
    }

    public PriceReductionDTO getPriceReductionDTO() {
        return priceReductionDTO;
    }

    public void setPriceReductionDTO(PriceReductionDTO priceReductionDTO) {
        this.priceReductionDTO = priceReductionDTO;
    }
}
