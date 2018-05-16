package com.twu.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> listAllBooks() {
        return books;
    }
}
