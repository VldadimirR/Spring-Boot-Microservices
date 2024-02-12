package com.example.basket_service;

import com.example.products_service.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/cart")
public interface ShoppingCartController {

    @PostMapping("/add")
    ResponseEntity<String> addProductToCart(@RequestBody Product product);

    @DeleteMapping("/remove/{productId}")
    ResponseEntity<String> removeProductFromCart(@PathVariable Long productId);

    @PostMapping("/checkout")
    ResponseEntity<String> checkout();

    @GetMapping("/view")
    ResponseEntity<List<Product>> viewCart();
}
