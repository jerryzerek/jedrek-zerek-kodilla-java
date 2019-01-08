package com.kodilla.good.patterns.challenges.AllegroProject;

public class PurchaseDto {
    public Product product;
    public boolean isPurchased;

    public PurchaseDto(Product product, boolean isPurchased) {
        this.product = product;
        this.isPurchased = isPurchased;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isPurchased() {
        return isPurchased;
    }
}
