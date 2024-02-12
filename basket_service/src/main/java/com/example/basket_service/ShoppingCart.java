package com.example.basket_service;

import com.example.products_service.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Long productId) {
        products.removeIf(product -> product.getId().equals(productId));
    }

    public void clear() {
        products.clear();
    }

    public void checkout() {
        clear();
    }
}
