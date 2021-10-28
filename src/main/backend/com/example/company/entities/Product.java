package com.example.company.entities;

import com.example.company.enums.ProductState;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "idproduct")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_id_seq")
    @SequenceGenerator(name = "product_id_seq",sequenceName = "product_id_seq", allocationSize = 1)
    private Long idProduct;
    private String description;
    @Column(name = "price",nullable = false)
    private double price;
    @Column(name = "productstate",nullable = false)
    private ProductState productState = ProductState.ACTIVE;
    @Column(name = "creationdate",nullable = false)
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
    private List<PriceReduction> priceReductionList;
}
