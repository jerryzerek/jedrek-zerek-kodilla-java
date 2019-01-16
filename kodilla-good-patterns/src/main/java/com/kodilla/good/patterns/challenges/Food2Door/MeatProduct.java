package com.kodilla.good.patterns.challenges.Food2Door;

public class MeatProduct extends Product {
    private String typeOfMeat;

    public MeatProduct(String typeOfMeat, String productName){
        super(productName);
        this.typeOfMeat = typeOfMeat;
    }

}
