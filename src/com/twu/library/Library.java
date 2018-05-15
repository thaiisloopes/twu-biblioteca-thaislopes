package com.twu.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books;

    public Library(List<String> books) {
        this.books = books;
    }

    public List<String> listAllBooks() {
        return books;
    }

}
