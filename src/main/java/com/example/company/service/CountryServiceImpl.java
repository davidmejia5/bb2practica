package com.example.company.service;

import com.example.company.dto.CountryDTO;
import com.example.company.entities.Country;
import com.example.company.repository.CountryRepository;
import com.googlecode.jmapper.JMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountryRepository countryRepository;

    public CountryDTO getCountryById(Long id){
        JMapper<CountryDTO,Country> countryCountryJMapper = new JMapper<>(CountryDTO.class,Country.class);
        CountryDTO result = countryCountryJMapper.getDestination(countryRepository.getById(id));

        return result;
    }

}
