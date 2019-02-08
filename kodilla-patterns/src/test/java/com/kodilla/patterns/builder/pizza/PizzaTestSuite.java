package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();

        Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder();
        builder.ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms");
        Pizza pizza1 = builder.build();

        System.out.println(pizza);

        //When
        int howManyIngredients = pizza.getIngredients().size();

        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
