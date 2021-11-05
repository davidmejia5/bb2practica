package com.example.company.entities;

import com.example.company.dto.SupplierDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Supplier {
    @Id
    @Column(name = "idsupplier")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "supplier_id_seq")
    @SequenceGenerator(name = "supplier_id_seq",sequenceName = "supplier_id_seq", allocationSize = 1)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "supplierList")
    List<Product> products = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "idcountry")
    private Country country;

    Supplier(SupplierDTO supplierDTO){
        this.id = supplierDTO.getId();
        this.name = supplierDTO.getName();
        this.country = new Country(supplierDTO.getCountryDTO());

    }

}
