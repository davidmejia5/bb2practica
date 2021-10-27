package com.example.company.service;

import com.example.company.dto.CountryDTO;
import com.example.company.entities.Country;
import com.example.company.repository.CountryRepository;
import com.googlecode.jmapper.JMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountryRepository countryRepository;

    public CountryDTO getCountryById(Long id){
        CountryDTO countryDTO = new CountryDTO(countryRepository.getById(id));
        return countryDTO;
    }

    public List<CountryDTO> getAllCountry(){
        List<Country> countryList = countryRepository.findAll();
        List<CountryDTO> countryDTOList = new ArrayList<>();
        for(Country country : countryList){
            CountryDTO countryDTO = new CountryDTO(country);
            countryDTOList.add(countryDTO);
        }
        return countryDTOList;
    }

}
