package com.example.company.dto;


import com.example.company.entities.Country;


public class CountryDTO {

    private Long idCountry;
    private String countryCode;
    private String name;

    public CountryDTO(Country country){
        this.idCountry = country.getIdCountry();
        this.countryCode = country.getCountryCode();
        this.name = country.getName();
    }


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
