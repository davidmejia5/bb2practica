package com.example.company.dto;

import com.example.company.entities.PriceReduction;
import com.example.company.entities.Product;
import com.example.company.entities.Supplier;
import com.example.company.enums.ProductState;
import com.googlecode.jmapper.annotations.JMap;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

    private Long idProduct;
    private String description;
    private double price;
    private ProductState productState = ProductState.ACTIVE;
    private Date creationDate;
    private List<SupplierDTO> supplierList = new ArrayList();
    private List<PriceReductionDTO> priceReductionList;

    public ProductDTO(Product product){
        this.idProduct = product.getIdProduct();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.productState = product.getProductState();
        this.creationDate = product.getCreationDate();

        for(Supplier supplier : product.getSupplierList()){
            this.supplierList.add(new SupplierDTO(supplier));
        }

        for(PriceReduction priceReduction: product.getPriceReductionList()){
            this.priceReductionList.add(new PriceReductionDTO(priceReduction));
        }
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
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

    public List<SupplierDTO> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<SupplierDTO> supplierList) {
        this.supplierList = supplierList;
    }

    public List<PriceReductionDTO> getPriceReductionList() {
        return priceReductionList;
    }

    public void setPriceReductionList(List<PriceReductionDTO> priceReductionList) {
        this.priceReductionList = priceReductionList;
    }
}
