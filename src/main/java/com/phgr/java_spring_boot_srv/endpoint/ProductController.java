package com.phgr.java_spring_boot_srv.endpoint;

import com.phgr.java_spring_boot_srv.domain.Product;
import com.phgr.java_spring_boot_srv.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

        @Autowired
        private ProductService service;

        @PostMapping
        public ResponseEntity<Product> create(@RequestBody Product product){
            return ResponseEntity.ok(service.createProduct(product));
        }

        @GetMapping
        public ResponseEntity<List<Product>> getAll(){
            return ResponseEntity.ok(service.getAllProducts());
        }

        @GetMapping("/{id}")
        public ResponseEntity<Optional<Product>> getById(@PathVariable String id){
            return ResponseEntity.ok(service.getProductById(id));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> delete(@PathVariable String id){
            service.deleteProduct(id);
            return ResponseEntity.noContent().build();
        }

        @DeleteMapping
        public ResponseEntity<Void> clearDb(){
            service.clearDb();
            return ResponseEntity.noContent().build();
        }
}
