package com.example.company.dto;


import com.googlecode.jmapper.annotations.JMap;

public class CountryDTO {
    @JMap
    private Long idCountry;
    @JMap
    private String countryCode;
    @JMap
    private String name;

    public Long getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
