package com.twu.library;

public class Book {
    private String name, author;
    private Integer id, yearPublished;
    private boolean available;

    public Book(Integer id, String name, String author, Integer yearPublished) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return this.id + " - " + this.name + ", " + this.author + ", " + this.yearPublished;
    }
}
