package com.phgr.java_spring_boot_srv.repository;

import com.phgr.java_spring_boot_srv.domain.dto.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductDTO, String> {

}
