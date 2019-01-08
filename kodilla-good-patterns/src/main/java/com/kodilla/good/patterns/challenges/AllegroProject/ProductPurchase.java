package com.kodilla.good.patterns.challenges.AllegroProject;

import java.time.LocalDateTime;

public class ProductPurchase {
    private Product product;
    private LocalDateTime purchaseDate;


    public ProductPurchase(final Product product,final LocalDateTime purchaseDate) {
        this.product = product;
        this.purchaseDate = purchaseDate;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }
}
