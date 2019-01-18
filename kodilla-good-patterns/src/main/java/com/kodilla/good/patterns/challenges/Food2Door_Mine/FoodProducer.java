package com.kodilla.good.patterns.challenges.Food2Door_Mine;

import java.util.Map;

public interface FoodProducer {
    public boolean process(Customer customer, Map<Product, Integer> productsOrder);
}
