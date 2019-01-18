package com.kodilla.good.patterns.challenges.Food2Door_Mine;

import java.util.List;

public class OrderService {
    public void orderAllService(List<OrderRequest> orderRequests) {
        orderRequests.stream()
                .map(n -> {
                    System.out.println("We're processing your order " + n.getCustomer().getName());
                    return n.getFoodProducer().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Ordered finished with success"));
    }
}
