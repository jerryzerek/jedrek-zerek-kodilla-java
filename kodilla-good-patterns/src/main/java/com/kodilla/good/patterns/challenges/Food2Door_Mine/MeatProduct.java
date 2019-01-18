package com.kodilla.good.patterns.challenges.Food2Door_Mine;

public class MeatProduct extends Product {
    private String typeOfMeat;

    public MeatProduct(String productName, String typeOfMeat) {
        super(productName);
        this.typeOfMeat = typeOfMeat;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }
}
