package com.kodilla.patterns.builder.bigmac;

public enum Sauce {
    TYSIACA_WYSP("Sos tysiąca wysp"),
    STANDARD("Sos standard"),
    BARBECUE("Sos barbecue");

    private String name;

    Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
