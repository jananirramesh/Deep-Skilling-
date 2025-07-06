package com.example;

public class Student {
    private MathBook book;

    public void setBook(MathBook book) {
        this.book = book;
    }

    public void study() {
        book.display();
    }
}