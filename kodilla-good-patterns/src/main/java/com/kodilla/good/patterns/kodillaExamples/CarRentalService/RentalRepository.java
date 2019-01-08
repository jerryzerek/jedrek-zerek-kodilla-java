package com.kodilla.good.patterns.kodillaExamples.CarRentalService;

import java.time.LocalDateTime;

public interface RentalRepository {
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
