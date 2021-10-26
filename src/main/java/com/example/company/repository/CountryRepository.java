package com.example.company.repository;

import com.example.company.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends JpaRepository<Country,Long>, CrudRepository<Country,Long> {

}
