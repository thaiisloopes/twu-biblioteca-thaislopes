package com.twu.library;

public class Book {
    private String name, author;
    private Integer id, yearPublished;

    public Book(Integer id, String name, String author, Integer yearPublished) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.id + " - " + this.name + ", " + this.author + ", " + this.yearPublished;
    }
}
