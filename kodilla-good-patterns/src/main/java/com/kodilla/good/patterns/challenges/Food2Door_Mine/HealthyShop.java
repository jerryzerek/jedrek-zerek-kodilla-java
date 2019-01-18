package com.kodilla.good.patterns.challenges.Food2Door_Mine;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements FoodProducer {
    private Map<Product, Integer> productsList;

    public HealthyShop() {
        productsList = createProductList();
    }

    public Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new MeatProduct("Mieso wolowe", "wolowe"), 50);
        productsList.put(new GrainProduct("maka", true), 100);
        productsList.put(new GlutenFreeProduct("Po tym produkcie bedziesz czuc sie lekko", "piwo bezglutenowe"), 100);

        return productsList;
    }

    public boolean isProductAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry: productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("We're sorry, we run out of the product");
                return false;
            }

        } return true;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (productsOrders.size() > 2 && isProductAvailable(productsOrders));
    }
}
