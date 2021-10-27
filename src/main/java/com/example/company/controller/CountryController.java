package com.example.company.controller;

import com.example.company.dto.CountryDTO;
import com.example.company.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public List<CountryDTO> getAllCountry(){
        return countryService.getAllCountry();
    }

    @GetMapping("/country/{id}")
    public CountryDTO getCountrId(@PathVariable Long id){
        return countryService.getCountryById(id);
    }

}
