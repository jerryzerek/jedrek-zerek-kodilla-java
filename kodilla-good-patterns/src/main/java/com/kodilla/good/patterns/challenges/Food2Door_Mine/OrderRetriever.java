package com.kodilla.good.patterns.challenges.Food2Door_Mine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {
    public List<OrderRequest> retrieve(){

        List<OrderRequest> orderRequests = new ArrayList<>();

        Customer customer = new Customer("John Black");
        FoodProducer foodProducer = new GlutenFreeShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GrainProduct("Mąka", true), 100);
        productsList.put(new GrainProduct("Kisiel", false), 50);

        Customer customer1 = new Customer("Jacek Czarny");
        FoodProducer foodProducer1 = new ExtraFoodShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList1.put(new MeatProduct("Karkówa z grila", "Kark"), 10);
        productsList1.put(new MeatProduct("Kaszana", "Niezidentyfikowano"),48);

        orderRequests.add(new OrderRequest(productsList, foodProducer, customer));
        orderRequests.add(new OrderRequest(productsList1, foodProducer1, customer1));

        return orderRequests;
    }
}
