package com.kodilla.good.patterns.challenges.AllegroProject;

import java.time.LocalDateTime;

public interface PurchaseService {
    boolean buy(Product product, LocalDateTime dateofPurchase);
}
