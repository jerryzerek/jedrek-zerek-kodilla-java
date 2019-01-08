package com.kodilla.good.patterns.challenges.AllegroProject;

import java.time.LocalDateTime;

public class ScreenPurchaseService implements PurchaseService{
    public boolean buy(final Product product, final LocalDateTime dateOfPurchase) {
        System.out.println("The user bought " + product.getName() + " for " + product.getPrice() +
                " on " + dateOfPurchase.toString());
        return true;
    }
}
