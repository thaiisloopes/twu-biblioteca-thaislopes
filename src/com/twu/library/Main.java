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

        verifyUserOption(option, menu, library, books);
    }

    private static void verifyUserOption(Menu.Option option, Menu menu, Library library, List<Book> books){
        switch (option){
            case LIST_ALL_AVAILABLE_BOOKS:
                List<Book> listBook;
                listBook = library.listAvailableBooks();
                System.out.println(formatBookList(listBook));
                System.out.println(menu.showMenu());
                Menu.Option option2 = menu.getUserChoiceFromMenu();
                verifyUserOption(option2, menu, library, books);
            case CHECKOUT_ITEM:
                int bookId;
                listBook = library.listAvailableBooks();
                System.out.println(formatBookList(listBook));
                System.out.println("Please insert the code of the book you want to checkout: ");
                Scanner read = new Scanner(System.in);
                bookId = read.nextInt();
                library.checkoutItem(books, bookId);
                System.out.println(formatBookList(library.listAvailableBooks()));
                System.out.println(menu.showMenu());
                Menu.Option option3 = menu.getUserChoiceFromMenu();
                verifyUserOption(option3, menu, library, books);
            case QUIT:
                break;
            default:
                System.out.println("Select a valid option!\n");
                System.out.println(menu.showMenu());
                Menu.Option option4 = menu.getUserChoiceFromMenu();
                verifyUserOption(option4, menu, library, books);
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
