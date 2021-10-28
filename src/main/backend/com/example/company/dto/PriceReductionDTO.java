package com.example.company.dto;

import com.example.company.entities.PriceReduction;

import java.sql.Date;

public class PriceReductionDTO {
    private Long id;
    private double reducePrice;
    private Date startDay;
    private Date endDay;

    public PriceReductionDTO(PriceReduction priceReduction){
        this.id = priceReduction.getId();
        this.reducePrice = priceReduction.getReducePrice();
        this.startDay = priceReduction.getStartDay();
        this.endDay = priceReduction.getEndDay();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(double reducePrice) {
        this.reducePrice = reducePrice;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }
}
