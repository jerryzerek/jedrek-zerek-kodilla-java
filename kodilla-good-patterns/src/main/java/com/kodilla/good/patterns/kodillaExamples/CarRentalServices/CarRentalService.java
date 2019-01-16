package com.kodilla.good.patterns.kodillaExamples.CarRentalServices;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {
    public boolean rent(final User user, LocalDateTime carRentFrom, LocalDateTime carRentTo) {
        System.out.println("Car rented by " + user.getFirstName() + " " + user.getLastName() + " from " +
                carRentFrom.toString() + " to " + carRentTo.toString());
        return true;
    }
}
