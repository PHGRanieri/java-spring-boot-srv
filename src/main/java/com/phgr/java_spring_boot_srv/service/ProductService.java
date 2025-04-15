package com.phgr.java_spring_boot_srv.service;

import com.phgr.java_spring_boot_srv.domain.dto.ProductDTO;
import com.phgr.java_spring_boot_srv.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductDTO createProduct(ProductDTO productDTO){
        return repository.save(productDTO);
    }

    public List<ProductDTO> getAllProducts(){
        return repository.findAll();
    }

    public Optional<ProductDTO> getProductById(String id){
        return repository.findById(id);
    }

    public void deleteProduct(String id){
        repository.deleteById(id);
    }

    public void clearDb(){
        repository.deleteAll();
    }

}
