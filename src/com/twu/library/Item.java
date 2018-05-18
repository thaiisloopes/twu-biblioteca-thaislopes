package com.twu.library;

public class Item {
    protected Integer id, yearPublished;
    protected String name;
    protected boolean available;
    protected Type type;

    public enum Type {
        BOOK, MOVIE
    }

    public Item(Integer id, Integer yearPublished, String name) {
        this.id = id;
        this.yearPublished = yearPublished;
        this.name = name;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
