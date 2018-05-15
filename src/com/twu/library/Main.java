package com.twu.library;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> listBooks;
        System.out.println("*********************************************");
        System.out.println("   Welcome to THE BANGALORE PUBLIC LIBRARY ");
        System.out.println("*********************************************\n");

        List<Book> books = Arrays.asList(
                new Book("The Pragmatic Programmer"),
                new Book("Test Driven Development"),
                new Book ("Java Web")
        );

        Library library = new Library(books);
        listBooks = library.listAllBooks();

        System.out.println("List of Available Books:\n");
        formatOutputListBooks(listBooks);
    }

    private static void formatOutputListBooks(List<Book> books){
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }
    }


}
