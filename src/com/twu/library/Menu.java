package com.twu.library;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public enum Option {
        LIST_ALL_AVAILABLE_BOOKS, CHECKOUT_ITEM, QUIT, INVALID_OPTION
    }

    public Menu() {
    }

    public String showMenu(){
        String menu = (
          "Please select an option: \n" +
          "1 - List all available books \n" +
          "2 - Checkout item \n" +
          "3 - Quit \n"
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
                return Option.CHECKOUT_ITEM;
            case 3:
                return Option.QUIT;
            default:
                return Option.INVALID_OPTION;
        }
    }


}
