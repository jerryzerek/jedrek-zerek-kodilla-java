package com.kodilla.good.patterns.challenges.Food2Door_Mine;

import javax.swing.text.html.Option;
import java.util.*;

public class GlutenFreeShop implements FoodProducer {
    private Map<Product, Integer> productsList;
    private List<Customer> blacklist;

    public GlutenFreeShop() {
        productsList = createProductList();
        blacklist = createBlackList();
    }

    public Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeProduct("The best gluten free product ever", "bezglutenowa kielaba"), 100);
        productsList.put(new GlutenFreeProduct("Yummy!", "bezglutenowa kaszanka"), 10);
        productsList.put(new GlutenFreeProduct("Samo zdrowie", "bezglutenowy schab"), 200);

        return productsList;
    }

    public List<Customer> createBlackList() {
        List<Customer> blacklist = new ArrayList<>();

        blacklist.add(new Customer("John Black"));
        return blacklist;
    }


    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Gluten Free Shop: We are sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean process (Customer customer, Map<Product, Integer> productsOrders) {
        return (!blacklist.contains(customer) && isProductsAvailable(productsOrders));
    }
}
