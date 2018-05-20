package com.twu.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;
    private List<User> users;
    private User loggedUser;

    public Library(List<Item> items, List<User> users) {
        this.items = items;
        this.users = users;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public List<Item> listAllItems() {
        return items;
    }

    public List<Item> listAvailableItems() {
        List<Item> availableItems = new ArrayList<Item>();
        for (int i = 0; i < items.size() ; i++) {
            if(items.get(i).isAvailable() == true){
                availableItems.add(items.get(i));
            }
        }
        return availableItems;
    }


    public void checkoutItem(Integer itemId){
        for (int i = 0; i < this.items.size(); i++) {
            if (itemId-1 == i){
                if(items.get(i).isAvailable() == true) {
                    System.out.println("Thank you! Enjoy the item!");
                    this.items.get(i).setAvailable(false);
                } else{
                    System.out.println("That item is not available.");
                }
            }
        }
    }

    public boolean returnItem(Integer itemId){
        for (int i = 0; i < this.items.size(); i++) {
            if (itemId-1 == i){
                if(items.get(i).isAvailable() == false) {
                    this.items.get(i).setAvailable(true);
                    return true;
                } else{
                    return false;
                }
            }
        }
        return false;
    }

    public boolean login(String libraryNumber, String password){
        for (int i = 0; i < users.size(); i++) {
            if((users.get(i).getLibraryNumber().equals(libraryNumber)) && (users.get(i).getPassword().equals(password))) {
                this.loggedUser = users.get(i);
                return true;
            }
        }
        return false;
    }
}
