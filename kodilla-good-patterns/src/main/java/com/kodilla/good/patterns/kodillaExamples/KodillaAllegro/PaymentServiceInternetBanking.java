package com.kodilla.good.patterns.kodillaExamples.KodillaAllegro;

public class PaymentServiceInternetBanking implements PaymentService {

    @Override
    public boolean process(Basket basket) {
        boolean isFinished = false;
        double toPay = basket.calculateValue();
        System.out.println("Zapłać za pomocą karty " + toPay);
        System.out.println("Płatność potwierdzona");
        isFinished = true;

        if (isFinished) {
            return true;
        } else {
            return false;
        }
    }
}
