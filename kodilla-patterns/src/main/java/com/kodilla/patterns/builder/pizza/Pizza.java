package com.kodilla.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {
    private String bottom;
    private String sauce;
    private List<String> ingredients;

    public static class PizzaBuilder {
        private String bottom;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public PizzaBuilder bottom(String bottom) {
            this.bottom = bottom;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.setBottom(bottom);
            pizza.setIngredients(ingredients);
            pizza.setSauce(sauce);
            return pizza;
        }
    }

    private Pizza() {
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getBottom() {
        return bottom;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bottom='" + bottom + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
