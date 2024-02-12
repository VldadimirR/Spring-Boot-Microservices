package com.example.products_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/products")
public interface ProductController {

    @GetMapping
    List<Product> getAllProducts();
    @PostMapping
    ResponseEntity<String> addProduct(Product product);

    @DeleteMapping("/{productId}")
    ResponseEntity<String> deleteProduct(@PathVariable Long productId);
}
