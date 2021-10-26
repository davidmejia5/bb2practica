package com.example.company.service;

import com.example.company.entities.Country;
import com.example.company.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountryRepository countryRepository;

    public Country getCountryById(Long id){

        return countryRepository.getById(id);
    }

}
