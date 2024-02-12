package com.example.basket_service;

import com.example.products_service.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    private final ShoppingCart shoppingCart = new ShoppingCart();

    public void addProduct(Product product) {
        shoppingCart.addProduct(product);
    }

    public void removeProduct(Long productId) {
        shoppingCart.removeProduct(productId);
    }

    public void checkout() {
        shoppingCart.checkout();
    }

    public List<Product> getProducts() {
        return shoppingCart.getProducts();
    }
}
