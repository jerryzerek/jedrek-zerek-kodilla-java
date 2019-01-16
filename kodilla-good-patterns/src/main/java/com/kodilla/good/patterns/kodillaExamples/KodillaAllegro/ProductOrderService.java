package com.kodilla.good.patterns.kodillaExamples.KodillaAllegro;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(Basket basket) {
        System.out.println("Sprawdzam dostępność towaru i dokonuje rezerwacji...OK");
        boolean isProductAvailable = true;

        if (isProductAvailable) {
            return true;
        } else {
            return false;
        }
    }

}
