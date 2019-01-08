package com.kodilla.good.patterns.kodillaExamples.CarRentalService;

import java.time.LocalDateTime;

public class RentalProcessor {
    private RentalService rentalService;

    public RentalProcessor(final RentalService rentalService) {
        this.rentalService = rentalService;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
        if (isRented) {
//            informationService.inform(rentRequest.getUser());
//            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}