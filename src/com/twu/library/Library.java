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
                if(books.get(i).isAvailable() == true) {
                    System.out.println("Thank you! Enjoy the book");
                    this.books.get(i).setAvailable(false);
                } else{
                    System.out.println("That book is not available.");
                }
            }
        }
    }

    public void returnBook(Integer bookId){
        for (int i = 0; i < this.books.size(); i++) {
            if (bookId-1 == i){
                if(books.get(i).isAvailable() == false) {
                    System.out.println("Thank you for returning the book.");
                    this.books.get(i).setAvailable(true);
                } else{
                    System.out.println("That is not a valid book to return.");
                }
            }
        }
    }

//    public boolean bookIsAvailable(Integer bookId){
//        return this.books.get(bookId).isAvailable();
//    }
}
