package com.example.basket_service;

import com.example.products_service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingCartControllerImpl implements ShoppingCartController{

    @Autowired
    private ShoppingCartService shoppingCartService;
    @Override
    public ResponseEntity<String> addProductToCart(@RequestBody Product product) {
        shoppingCartService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body("Product added to cart successfully");
    }

    @Override
    public ResponseEntity<String> removeProductFromCart(Long productId) {
        shoppingCartService.removeProduct(productId);
        return ResponseEntity.ok("Product removed from cart successfully");
    }

    @Override
    public ResponseEntity<String> checkout() {
        shoppingCartService.checkout();
        return ResponseEntity.ok("Order checked out successfully");
    }

    @Override
    public ResponseEntity<List<Product>> viewCart() {
        List<Product> cartProducts = shoppingCartService.getProducts();
        return ResponseEntity.ok(cartProducts);
    }
}
