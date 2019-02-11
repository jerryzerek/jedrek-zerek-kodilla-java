package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testPizzaNew() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.BUN_WITH_SEZAM)
                .ingredient(Ingredient.TOMATO)
                .burgers(2)
                .ingredient(Ingredient.SHRIMPS)
                .ingredient(Ingredient.CHEESE)
                .sauce(Sauce.TYSIACA_WYSP)
                .ingredient(Ingredient.ONION)
                .build();

        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        String sauce = bigmac.getSauceType().get(0).getName();

        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals("Sos tysiąca wysp", sauce);

    }
}
