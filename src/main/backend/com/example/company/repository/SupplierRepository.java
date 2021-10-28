package com.example.company.repository;

import com.example.company.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Long>, CrudRepository<Supplier,Long> {
}
