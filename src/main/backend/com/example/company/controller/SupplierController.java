package com.example.company.controller;

import com.example.company.dto.SupplierDTO;
import com.example.company.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @GetMapping("/supplier")
    public List<SupplierDTO> getAllSupplier(){
        return supplierService.getAllSupplier();
    }
    @GetMapping("/supplier/{id}")
    public SupplierDTO findSupplierById(@PathVariable Long id){
        return supplierService.findSupplierById(id);
    }
}
