package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class OrderRequest {
    private FoodProducer foodProducer;
    private Customer customer;
    private Map<Product, Integer> productOrderRequest;

    public OrderRequest(FoodProducer foodProducer, Customer customer, Map<Product, Integer> productOrderRequest) {
        this.foodProducer = foodProducer;
        this.customer = customer;
        this.productOrderRequest = productOrderRequest;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
