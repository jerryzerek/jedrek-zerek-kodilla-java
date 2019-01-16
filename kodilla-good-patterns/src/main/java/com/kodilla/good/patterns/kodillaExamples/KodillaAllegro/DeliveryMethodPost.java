package com.kodilla.good.patterns.kodillaExamples.KodillaAllegro;

public class DeliveryMethodPost implements DeliveryMethod {

    @Override
    public double calculatePriceOfDelivery(Basket basket) {
        double finalPriceOfDelivery = 0;
        for (Product product: basket.getBasket()) {
            finalPriceOfDelivery =+ product.getItemDeliveryPrice() * product.getQuantity();
        }
        return finalPriceOfDelivery;
    }
}
