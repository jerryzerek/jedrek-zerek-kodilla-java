package com.kodilla.good.patterns.kodillaExamples.ProstySklep;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processOrder(new OrderRetriever().retrieve());
    }
}
