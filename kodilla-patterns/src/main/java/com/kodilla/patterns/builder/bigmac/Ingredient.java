package com.kodilla.patterns.builder.bigmac;

public enum Ingredient {
    ONION("Onion"),
    TOMATO("Tomato"),
    LETTUCE("Lettuce"),
    BACON("Bacon"),
    CUCUMBER("Cucumber"),
    PEPPERS("Peppers"),
    CHILI("Chilli peppers"),
    MUSHROOMS("Mushrooms"),
    SHRIMPS("Shrimps"),
    CHEESE("Cheese");


    private String name;

    Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
