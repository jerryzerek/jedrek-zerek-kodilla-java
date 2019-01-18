package com.kodilla.good.patterns.challenges.Food2Door_Mine;

public class GlutenFreeProduct extends Product {
    private String productDescription;

    public GlutenFreeProduct(String productDescription, String productName) {
        super(productName);
        this.productDescription = productDescription;
    }
}
