package com.kodilla.good.patterns.challenges.AllegroProject;

public class ProductOrderService {
    private PurchaseService purchaseService;

    public ProductOrderService(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    public PurchaseDto process(final ProductPurchase productPurchase) {
        boolean isPurchased = purchaseService.buy(productPurchase.getProduct(), productPurchase.getPurchaseDate());
        if (isPurchased) {
            return new PurchaseDto(productPurchase.getProduct(), true);
        } else {
            return new PurchaseDto(productPurchase.getProduct(), false);
        }
    }
}
