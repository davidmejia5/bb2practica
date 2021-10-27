package com.example.company.service;

import com.example.company.dto.ProductDTO;
import com.example.company.entities.Product;
import com.example.company.repository.ProductRepository;
import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public ProductDTO findById(Long id){
        Product product = productRepository.getById(id);
//        JMapperAPI jmapperApi = new JMapperAPI().add(JMapperAPI.mappedClass(ProductDTO.class));
//        ProductDTO productDTO = new ProductDTO(product);
        JMapper<ProductDTO,Product> productJMapper = new JMapper<>(ProductDTO.class,Product.class);
        ProductDTO productDTO = productJMapper.getDestination(product);

        return productDTO;
    }
    public List<ProductDTO> findAllProduct(){
       /* List<Product> productList = productRepository.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();
        for(Product p : productList){
            productDTOList.add(new ProductDTO(p));
        }*/
        return null;
    }

    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }

    public Product save(ProductDTO productDTO){
        JMapper<Product,ProductDTO> productDTOJMapper = new JMapper<>(Product.class,ProductDTO.class);
        Product result = productDTOJMapper.getDestination(productDTO);
        productRepository.save(result);
        return result;
    }

}
