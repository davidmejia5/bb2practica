package com.example.company.entities;

import com.example.company.dto.PriceReductionDTO;
import com.example.company.dto.ProductDTO;
import com.example.company.dto.SupplierDTO;
import com.example.company.enums.ProductState;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "idproduct")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "product_id_seq")
    private Long idProduct;
    private String description;
    @Column(name = "price",nullable = false)
    private double price;
    @Column(name = "productstate",nullable = false)
    private ProductState productState = ProductState.ACTIVE;
    @Column(name="creationdate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date creationDate;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "PRODUCT_SUPPLIER",
            joinColumns = {@JoinColumn(name = "idproduct")},
            inverseJoinColumns = {@JoinColumn(name = "idsupplier")}
    )
    private List<Supplier> supplierList = new ArrayList();
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "PRICE_REDUCTION",
            joinColumns = {@JoinColumn(name = "idproduct")},
            inverseJoinColumns = {@JoinColumn(name = "idpricereduction")}
    )
    private List<PriceReduction> priceReductionList = new ArrayList();



    public Product(ProductDTO productDTO){
        this.idProduct = productDTO.getIdProduct();
        this.description = productDTO.getDescription();
        this.price = productDTO.getPrice();
        this.productState = productDTO.getProductState();
        this.creationDate = productDTO.getCreationDate();

        for(SupplierDTO supplierDTO : productDTO.getSupplierList()){
            supplierList.add(new Supplier(supplierDTO));
        }

        for(PriceReductionDTO priceReductionDTO: productDTO.getPriceReductionList()){
            priceReductionList.add(new PriceReduction(priceReductionDTO));
        }

    }
}
