package com.example.reviews_service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewControllerImpl implements ReviewController{

    @Autowired
    private ReviewService reviewService;

    @Override
    public ResponseEntity<String> addReview(Review review) {
        reviewService.addReview(review);
        return ResponseEntity.status(HttpStatus.CREATED).body("Review added successfully");
    }


    @Override
    public ResponseEntity<List<Review>> getReviewsByProductId(Long productId) {
        List<Review> reviews = reviewService.getReviewsByProductId(productId);
        return ResponseEntity.ok(reviews);
    }
}
