package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private List<Bun> bunType;
    private List<Sauce> sauceType;
    private int burgers;
    private List<Ingredient> ingredients;

    public static class BigmacBuilder {
        private List<Bun> bunType = new ArrayList<>();
        private List<Sauce> sauceType = new ArrayList<>();
        private int burgers;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun) {
            bunType.add(bun);
            return this;
        }

        public BigmacBuilder burgers (int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            sauceType.add(sauce);
            return this;
        }


        public BigmacBuilder ingredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            Bigmac bigmac = new Bigmac();
            bigmac.setSauceType(sauceType);
            bigmac.setBun(bunType);
            bigmac.setBurgers(burgers);
            bigmac.setIngredients(ingredients);
            return bigmac;
        }
    }

    private Bigmac() {
    }

    public void setBun(List<Bun> bunType) {
        this.bunType = bunType;
    }

    public void setBurgers(int burgers) {
        this.burgers = burgers;
    }

    public void setSauceType(List<Sauce> sauceType) {
        this.sauceType = sauceType;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
}

    public List<Bun> getBunType() {
        return bunType;
    }

    public List<Sauce> getSauceType() {
        return sauceType;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bunType=" + bunType +
                ", sauceType=" + sauceType +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
