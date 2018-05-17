package com.twu.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> listAllBooks() {
        return books;
    }

    public List<Book> listAvailableBooks() {
        List<Book> availableBooks = new ArrayList<Book>();
        for (int i = 0; i < books.size() ; i++) {
            if(books.get(i).isAvailable() == true){
                availableBooks.add(books.get(i));
            }
        }
        return availableBooks;
    }


    public void checkoutItem(Integer bookId){
        for (int i = 0; i < this.books.size(); i++) {
            if (bookId-1 == i){
                this.books.get(i).setAvailable(false);
            }
        }
    }
}
