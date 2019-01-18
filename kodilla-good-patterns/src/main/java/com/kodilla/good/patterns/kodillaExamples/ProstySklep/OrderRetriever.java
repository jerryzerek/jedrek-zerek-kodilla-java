package com.kodilla.good.patterns.kodillaExamples.ProstySklep;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer("Marek Plawgo");
        FoodProducer foodProducer = new MeatProducer();
        Map<Product, Integer> ordererProducts = new HashMap<>();

        ordererProducts.put(new MeatProduct("wolowina", "pyszna wolowinka"), 1);
        ordererProducts.put(new MeatProduct("schab","wspanialy schabik"), 1);

        OrderRequest orderRequest = new OrderRequest(customer, foodProducer, ordererProducts);
        return orderRequest;
    }
}
