package com.kodilla.good.patterns.kodillaExamples.ProstySklep;

import java.util.Objects;

public class MeatProduct extends Product {
    private String shortDescription;

    public MeatProduct(String productName, String shortDescription) {
        super(productName);
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeatProduct that = (MeatProduct) o;
        return Objects.equals(getShortDescription(), that.getShortDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShortDescription());
    }
}
