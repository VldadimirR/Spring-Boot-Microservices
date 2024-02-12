package com.example.reviews_service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReviewService {

    private final Map<Long, List<Review>> reviewsByProduct = new HashMap<>();

    public void addReview(Review review) {
        Long productId = review.getProductId();
        reviewsByProduct.computeIfAbsent(productId, k -> new ArrayList<>()).add(review);
    }

    public List<Review> getReviewsByProductId(Long productId) {
        return reviewsByProduct.getOrDefault(productId, new ArrayList<>());
    }
}
