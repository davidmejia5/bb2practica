package com.example.company.entities;

import com.example.company.dto.PriceReductionDTO;
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
@Table(name = "pricereduction")
public class PriceReduction {
    @Id
    @Column(name = "idpricereduction")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pricereduction_id_seq")
    @SequenceGenerator(name = "pricereduction_id_seq",sequenceName = "pricereduction_id_seq", allocationSize = 1)
    private Long id;
    @Column(name = "reduceprice")
    private double reducePrice;
    @Column(name = "startday")
    private Date startDay;
    @Column(name = "endday")
    private Date endDay;
    @ManyToMany(mappedBy = "priceReductionList")
    List<Product> productList = new ArrayList<>();

    public PriceReduction(PriceReductionDTO priceReductionDTO){
        this.id = priceReductionDTO.getId();
        this.reducePrice = priceReductionDTO.getReducePrice();
        this.startDay = priceReductionDTO.getStartDay();
        this.endDay = priceReductionDTO.getEndDay();
    }
}
