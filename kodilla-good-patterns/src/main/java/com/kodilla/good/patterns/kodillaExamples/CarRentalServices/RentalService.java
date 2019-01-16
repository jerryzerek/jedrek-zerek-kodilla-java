package com.kodilla.good.patterns.kodillaExamples.CarRentalServices;

import java.time.LocalDateTime;

public interface RentalService {
    boolean rent (User user, LocalDateTime from, LocalDateTime to);
}
