package com.kodilla.good.patterns.challenges.AllegroProject;

import java.time.LocalDateTime;

public class ProductPurchaseRetriever {
    public ProductPurchase retrtieve() {
        Product product = new Product("Monitor", 99.99);
        LocalDateTime timeOfPurchase = LocalDateTime.of(2019, 1, 8, 12, 56);


        return new ProductPurchase(product, timeOfPurchase);
    }
}
