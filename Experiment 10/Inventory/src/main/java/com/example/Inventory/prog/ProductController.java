package com.example.Inventory.prog;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        repo.save(product);
        return ResponseEntity.ok("Product added successfully with ID: " + product.getId());
    }
}