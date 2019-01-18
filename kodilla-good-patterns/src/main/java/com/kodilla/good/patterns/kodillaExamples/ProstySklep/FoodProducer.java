package com.kodilla.good.patterns.kodillaExamples.ProstySklep;

import java.util.Map;

public interface FoodProducer {
    boolean process (Map<Product, Integer> orderedProducts);
}
