package com.example.company.service;

import com.example.company.dto.SupplierDTO;
import com.example.company.entities.Supplier;
import com.example.company.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService{

    @Autowired
    SupplierRepository supplierRepository;

    public SupplierDTO findSupplierById(Long id){
        SupplierDTO supplierDTO = new SupplierDTO(supplierRepository.getById(id));
        return supplierDTO;
    }

    public List<SupplierDTO> getAllSupplier(){
        List<Supplier> supplierList = supplierRepository.findAll();
        List<SupplierDTO> supplierDTOList = new ArrayList<>();
        for(Supplier supplier : supplierList){
            SupplierDTO supplierDTO = new SupplierDTO(supplier);
            supplierDTOList.add(supplierDTO);
        }
        return supplierDTOList;
    }

}
