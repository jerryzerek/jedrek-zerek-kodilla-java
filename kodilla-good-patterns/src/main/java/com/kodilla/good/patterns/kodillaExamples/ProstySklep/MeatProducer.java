package com.kodilla.good.patterns.kodillaExamples.ProstySklep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MeatProducer implements FoodProducer {
    private Map<Product, Integer> meatProducts;
    String blacklist = "Marek Plawgo";

    public String getBlacklist() {
        return blacklist;
    }


    public MeatProducer() {
        meatProducts = addMeatProducts();
    }

    public Map<Product, Integer> addMeatProducts() {
        Map<Product, Integer> meatProducts = new HashMap<>();

        meatProducts.put(new MeatProduct("wolowina", "pyszna wolowinka"), 10);
        meatProducts.put(new MeatProduct("schab", "wspanialy schabik"), 12);

        return meatProducts;
    }


    @Override
    public boolean process(Map<Product, Integer> products) {
        return (isProductAvailable(products));
    }

    public boolean isProductAvailable(Map<Product, Integer> products) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(meatProducts.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()){
                System.out.println("Sorry, the product is unavailable");
                return false;
            }
        }
        System.out.println("Order confirmed!");
        return true;
    }
}