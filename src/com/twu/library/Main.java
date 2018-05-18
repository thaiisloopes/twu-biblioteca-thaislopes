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

        processUserOption(menu, library, books);
    }

    private static void processUserOption(Menu menu, Library library, List<Book> books){
        System.out.println(menu.showMenu());
        Menu.Option option = menu.getUserChoiceFromMenu();

        switch (option){
            case LIST_ALL_AVAILABLE_BOOKS:
                List<Book> listBook;
                listBook = library.listAvailableBooks();
                System.out.println(formatBookList(listBook));
                break;
            case CHECKOUT_BOOK:
                int bookCheckoutId;
                listBook = library.listAvailableBooks();
                System.out.println(formatBookList(listBook));
                System.out.println("Please insert the code of the book you want to checkout: ");
                Scanner read = new Scanner(System.in);
                bookCheckoutId = read.nextInt();
                library.checkoutItem(bookCheckoutId);
                System.out.println("\nAvailable Books: ");
                System.out.println(formatBookList(library.listAvailableBooks()));
                break;
            case RETURN_BOOK:
                int bookReturnId;
                System.out.println("Please insert the code of the book you want to return: ");
                Scanner scan = new Scanner(System.in);
                bookReturnId = scan.nextInt();
                Boolean bookReturned = library.returnBook(bookReturnId);
                if(bookReturned){
                    System.out.println("Thank you for returning the book.");
                } else{
                    System.out.println("That is not a valid book to return.");
                }
                System.out.println("\nAvailable Books: ");
                System.out.println(formatBookList(library.listAvailableBooks()));
                break;
            case QUIT:
                return;
            default:
                System.out.println("Select a valid option!\n");
                break;
        }
        processUserOption(menu, library, books);
    }

    private static String formatBookList(List<Book> books) {
        String bookList = "";
        for (int i = 0; i < books.size(); i++) {
            bookList += books.get(i).toString() + "\n";
        }
        return bookList;
    }
}
