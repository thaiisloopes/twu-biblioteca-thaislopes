package com.twu.library;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public enum Option {
        LIST_ALL_AVAILABLE_BOOKS, CHECKOUT_BOOK, RETURN_BOOK, QUIT, INVALID_OPTION
    }

    public Menu() {
    }

    public String showMenu(){
        String menu = (
          "Please select an option: \n" +
          "1 - List All Available Books \n" +
          "2 - Checkout Book \n" +
          "3 - Return Book \n" +
          "4 - Quit \n"
        );
        return menu;
    }

    public static Option getUserChoiceFromMenu(){
        int option = 0;

        Scanner read = new Scanner(System.in);
        option = read.nextInt();


        switch (option){
            case 1:
                return Option.LIST_ALL_AVAILABLE_BOOKS;
            case 2:
                return Option.CHECKOUT_BOOK;
            case 3:
                return Option.RETURN_BOOK;
            case 4:
                return Option.QUIT;
            default:
                return Option.INVALID_OPTION;
        }
    }


}
