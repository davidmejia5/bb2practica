package com.example.company.service;

import com.example.company.entities.Supplier;
import com.example.company.repository.SupplierRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService{

    SupplierRepository supplierRepository;


    public Supplier findSupplierById(Long id){
        return supplierRepository.getById(id);
    }

}
