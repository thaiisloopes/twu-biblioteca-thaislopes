package com.twu.library;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("   Welcome to THE BANGALORE PUBLIC LIBRARY ");
        System.out.print("*********************************************");
    }

    List<Book> books = Arrays.asList(
        new Book("The Pragmatic Programmer"),
        new Book("Test Driven Development")
    );

    Library library = new Library(books);
}
