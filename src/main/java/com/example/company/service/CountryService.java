package com.example.company.service;

import com.example.company.entities.Country;
import org.springframework.stereotype.Service;

public interface CountryService {

    public Country getCountryById(Long id);
}
