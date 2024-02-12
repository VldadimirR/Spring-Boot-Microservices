package com.example.reviews_service;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/reviews")
public interface ReviewController {

    @PostMapping
    ResponseEntity<String> addReview(@RequestBody Review review);

    @GetMapping("/{productId}")
    ResponseEntity<List<Review>> getReviewsByProductId(@PathVariable Long productId);
}
