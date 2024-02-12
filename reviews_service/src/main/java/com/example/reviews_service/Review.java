package com.example.reviews_service;

import java.util.Objects;

public class Review {

    private Long id;
    private Long productId;
    private String text;

    public Review(Long id, Long productId, String text) {
        this.id = id;
        this.productId = productId;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id) && Objects.equals(productId, review.productId) && Objects.equals(text, review.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, text);
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", productId=" + productId +
                ", text='" + text + '\'' +
                '}';
    }
}
