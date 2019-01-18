package com.kodilla.good.patterns.kodillaExamples.ProstySklep;

public class OrderService {
    public boolean processOrder(OrderRequest orderRequest) {
        System.out.println("We're processing order for " + orderRequest.getCustomer().getName());
        return orderRequest.getFoodProducer().process(orderRequest.getOrderedProducts());
    }

}
