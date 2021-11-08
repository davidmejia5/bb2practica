package com.example.company.service;

import com.example.company.dto.ProductDTO;
import com.example.company.entities.Product;
import com.example.company.enums.ProductState;
import com.example.company.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public ProductDTO findById(Long id){
        Product product = productRepository.getById(id);
        ProductDTO productDTO = new ProductDTO(product);
        return productDTO;
    }

    public List<ProductDTO> findAllProduct(){
       List<Product> productList = productRepository.findAll();
       List<ProductDTO> productDTOList = new ArrayList<>();
       for(Product p : productList){
           productDTOList.add(new ProductDTO(p));
       }
        return productDTOList;
    }

    public void changeState(Long id) {
        Optional<Product> prod = productRepository.findById(id);
        if(prod.isPresent()){
            if(prod.get().getProductState().getState() == 0 ){
                ProductState productState = prod.get().getProductState();
                productState.setState(1);
                productState.setValueState("Discounted");
                prod.get().setProductState(productState);
                productRepository.save(prod.get());
            }
        }
    }


    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }

    public Optional<Product> update(ProductDTO productDTO){

        Optional<Product> prod = productRepository.findById(productDTO.getIdProduct());
        if(prod.isPresent()){
            //Modificar datos en entidad
            //set del dto
            prod.get().setIdProduct(productDTO.getIdProduct());
            prod.get().setProductState(productDTO.getProductState());
            prod.get().setPrice(productDTO.getPrice());
            productRepository.save(prod.get());
            return prod;
        }
        return Optional.empty();
    }

}
