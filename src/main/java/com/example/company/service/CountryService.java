package com.example.company.service;

import com.example.company.dto.CountryDTO;
import com.example.company.entities.Country;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CountryService {

    public CountryDTO getCountryById(Long id);
    public List<CountryDTO> getAllCountry();
}
