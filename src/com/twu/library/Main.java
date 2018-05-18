package com.twu.library;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String libraryNumber, password;

        System.out.println("*********************************************");
        System.out.println("   Welcome to THE BANGALORE PUBLIC LIBRARY ");
        System.out.println("*********************************************\n");

        List<Item> items = Arrays.asList(
                new Book(1,1999, "The Pragmatic Programmer", "Andy Hunt"),
                new Book(2,2000, "Test Driven Development", "Kent Beck"),
                new Movie (3,1998, "Titanic", 9, "James Cameron")
        );

        List<User> users = Arrays.asList(
                new User("999-8888", "123456"),
                new User("999-0000", "123")
        );

        Library library = new Library(items, users);

        Scanner read = new Scanner(System.in);
        System.out.println("Please insert your Library Number: ");
        libraryNumber = read.next();

        System.out.println("\nPlease insert your Password: ");
        password = read.next();

        if(library.login(libraryNumber, password) == false){
            System.out.println("\nLogin or password incorrect. Please try again.");
            return;
        } else{
            System.out.println("\nLogin was done with success!");
    }

        Menu menu = new Menu();

        processUserOption(menu, library, items);
    }

    private static void processUserOption(Menu menu, Library library, List<Item> items){
        System.out.println(menu.showMenu());
        Menu.Option option = menu.getUserChoiceFromMenu();

        switch (option){
            case LIST_ALL_AVAILABLE_ITEMS:
                List<Item> listItem;
                listItem = library.listAvailableItems();
                System.out.println(formatItemList(listItem));
                break;
            case CHECKOUT_ITEM:
                int itemCheckoutId;
                listItem = library.listAvailableItems();
                System.out.println(formatItemList(listItem));
                System.out.println("Please insert the code of the item you want to checkout: ");
                Scanner read = new Scanner(System.in);
                itemCheckoutId = read.nextInt();
                library.checkoutItem(itemCheckoutId);
                System.out.println("\nAvailable Items: ");
                System.out.println(formatItemList(library.listAvailableItems()));
                break;
            case RETURN_ITEM:
                int bookReturnId;
                System.out.println("Please insert the code of the book you want to return: ");
                Scanner scan = new Scanner(System.in);
                bookReturnId = scan.nextInt();
                Boolean bookReturned = library.returnItem(bookReturnId);
                if(bookReturned){
                    System.out.println("Thank you for returning the item.");
                } else{
                    System.out.println("That is not a valid item to return.");
                }
                System.out.println("\nAvailable Items: ");
                System.out.println(formatItemList(library.listAvailableItems()));
                break;
            case QUIT:
                return;
            default:
                System.out.println("Select a valid option!\n");
                break;
        }
        processUserOption(menu, library, items);
    }

    private static String formatItemList(List<Item> items) {
        String itemList = "";
        for (int i = 0; i < items.size(); i++) {
            itemList += items.get(i).toString() + "\n";
        }
        return itemList;
    }
}
