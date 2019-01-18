package com.kodilla.good.patterns.challenges.Food2Door_Mine;

public class Food2Door {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.orderAllService(new OrderRetriever().retrieve());
    }
}
