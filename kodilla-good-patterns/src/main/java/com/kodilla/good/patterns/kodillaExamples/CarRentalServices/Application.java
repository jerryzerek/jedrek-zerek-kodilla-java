package com.kodilla.good.patterns.kodillaExamples.CarRentalServices;

public class Application {
    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();

        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(new CarRentalService());
        rentalProcessor.process(rentRequest);

    }
}
