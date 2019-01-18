package com.kodilla.good.patterns.challenges.Food2Door_Mine;

public class GrainProduct extends Product {
    private boolean isBIO;

    public GrainProduct(String productName, boolean isBIO) {
        super(productName);
        this.isBIO = isBIO;
    }
}
