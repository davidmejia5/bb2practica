package com.example.company.repository;

import com.example.company.entities.PriceReduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PriceReductionRepository extends JpaRepository<PriceReduction,Long>, CrudRepository<PriceReduction,Long> {
}
