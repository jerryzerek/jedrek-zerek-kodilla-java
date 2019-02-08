package com.kodilla.patterns.builder.bigmac;

public enum Bun {
    BUN_WITH_SEZAM("Bun with sezam"),
    BUN_WITHOUT_SEZAM("Bun without sezam");

    private String name;

    Bun(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
