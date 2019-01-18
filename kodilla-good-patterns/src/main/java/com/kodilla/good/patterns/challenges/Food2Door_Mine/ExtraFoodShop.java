package com.kodilla.good.patterns.challenges.Food2Door_Mine;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodProducer {
    private Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductsList();
    }

    public Map<Product, Integer> createProductsList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new MeatProduct("pork chop", "pork"), 10);
        productsList.put(new MeatProduct("knuckle", "pork"), 5);
        productsList.put(new GrainProduct("millet", true), 10);
        productsList.put(new GrainProduct("oatmeal", false), 0);

        return productsList;
    }

    public boolean process (Customer customer, Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry: productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Extra Food Shop: sorry, we're run out of products");
                return false;
            }
        }
        return true;
    }
}
