package com.example.company.service;

import com.example.company.dto.SupplierDTO;
import com.example.company.entities.Supplier;

import java.util.List;

public interface SupplierService {
    public SupplierDTO findSupplierById(Long id);
    public List<SupplierDTO> getAllSupplier();
}