package com.kodilla.good.patterns.kodillaExamples.KodillaAllegro;

public class WarehouseServiceImpl implements WarehouseService{
    public void sendToUser (User user, Basket basket) {
        System.out.println("Skompletuj i wyślij " + basket + " do " + user.getName());
    }
}
