package com.kodilla.good.patterns.challenges.AllegroProject;

public class Application {
    public static void main(String[] args) {
        ProductPurchaseRetriever productPurchaseRetriever = new ProductPurchaseRetriever();
        ProductPurchase productPurchase = productPurchaseRetriever.retrtieve();

        ProductOrderService productOrderService = new ProductOrderService(new ScreenPurchaseService());
        productOrderService.process(productPurchase);
    }


}
