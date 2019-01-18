package com.kodilla.good.patterns.challenges.Food2Door_Mine;

import java.util.Map;

public class OrderRequest {
    Map<Product, Integer> productOrderRequest;
    private FoodProducer foodProducer;
    private Customer customer;

    public OrderRequest(Map<Product, Integer> productOrderRequest, FoodProducer foodProducer, Customer customer) {
        this.productOrderRequest = productOrderRequest;
        this.foodProducer = foodProducer;
        this.customer = customer;
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
