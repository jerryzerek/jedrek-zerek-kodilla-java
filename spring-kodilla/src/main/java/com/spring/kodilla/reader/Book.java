package com.spring.kodilla.reader;

public final class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void getTitle() {
        System.out.println("Reading: " + title);
    }
}
