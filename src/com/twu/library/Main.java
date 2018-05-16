package com.twu.library;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("   Welcome to THE BANGALORE PUBLIC LIBRARY ");
        System.out.println("*********************************************\n");

        List<Book> books = Arrays.asList(
                new Book(1, "The Pragmatic Programmer", "Andy Hunt", 1999),
                new Book(2, "Test Driven Development", "Kent Beck", 2000),
                new Book (3, "Java Web", "Vishal Layka", 2005)
        );

        Library library = new Library(books);


        Menu menu = new Menu();
        System.out.println(menu.showMenu());

        Menu.Option option = menu.getUserChoiceFromMenu();

        if(option == Menu.Option.LIST_ALL_AVAILABLE_BOOKS) {
            List<Book> listBook;
            listBook = library.listAllBooks();
            System.out.println(formatBookList(listBook));
        }
    }

    private static String formatBookList(List<Book> books) {
        String bookList = "";
        for (int i = 0; i < books.size(); i++) {
            bookList += books.get(i).toString() + "\n";
        }
        return bookList;
    }
}
