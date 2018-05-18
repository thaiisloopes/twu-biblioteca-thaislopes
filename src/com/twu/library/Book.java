package com.twu.library;

public class Book extends Item{
    private String author;

    public Book(Integer id, Integer yearPublished, String name, String author) {
        super(id, yearPublished, name);
        this.author = author;
        this.type = Type.BOOK;
    }

    public String toString() {
        return this.id + " - " + this.name + ", " + this.author + ", " + this.yearPublished + " - (" + this.type + ")";
    }
}
