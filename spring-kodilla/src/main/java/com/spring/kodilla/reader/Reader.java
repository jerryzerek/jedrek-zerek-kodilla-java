package com.spring.kodilla.reader;

public final class Reader {
    private Book book;

    public Reader(Book book) {
        this.book = book;
    }

    public void read() {
        book.getTitle();
    }
}
