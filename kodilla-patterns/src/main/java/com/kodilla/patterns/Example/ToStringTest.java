package com.kodilla.patterns.Example;

import java.util.ArrayList;
import java.util.List;

public class ToStringTest {
    private List<String> list;
    private String name;

    public ToStringTest(String name) {
        this.name = name;
        list = addElementsToList();
    }

    public List<String> addElementsToList() {
        List<String> lista = new ArrayList<>();

        lista.add("Zadanie 1");
        lista.add("Zadanie 2");
        lista.add("Zadanie 3");

        return lista;
    }

    public String toString() {
        String s = "Nazwa listy to " + name;
        for (String string: list) {
            s = s + "\n" + string;
        }
        return s;
    }
}
