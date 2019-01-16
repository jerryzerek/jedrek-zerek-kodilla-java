package com.kodilla.good.patterns.kodillaExamples.KodillaAllegro;

public class OrderRequestRetriever {
    public OrderRequest orderRetriever() {
        User user = new User("Smith", "Janek");
        Basket basket = new Basket();
        return new OrderRequest(user, basket);
    }
}
