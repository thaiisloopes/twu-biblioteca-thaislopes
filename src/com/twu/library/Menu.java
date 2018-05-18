package com.twu.library;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public enum Option {
        LIST_ALL_AVAILABLE_ITEMS, CHECKOUT_ITEM, RETURN_ITEM,
        QUIT, INVALID_OPTION
    }

    public Menu() {
    }

    public String showMenu(){
        String menu = (
          "Please select an option: \n" +
          "1 - List All Available Items \n" +
          "2 - Checkout Item \n" +
          "3 - Return Item \n" +
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
                return Option.LIST_ALL_AVAILABLE_ITEMS;
            case 2:
                return Option.CHECKOUT_ITEM;
            case 3:
                return Option.RETURN_ITEM;
            case 4:
                return Option.QUIT;
            default:
                return Option.INVALID_OPTION;
        }
    }


}
