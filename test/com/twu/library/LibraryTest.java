package com.twu.library;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testListAllItems(){
        List<Item> items = Arrays.asList(
                new Book(1,1999, "The Pragmatic Programmer", "Andy Hunt"),
                new Book(2,2000, "Test Driven Development", "Kent Beck"),
                new Movie(3,1998, "Titanic", 9, "James Cameron"),
                new Movie(4,2001, "White Chicks",10, "Keenen Ivory Wayans" )
        );
        User user1 = new User("Thaís", "tlnunes@thoughworks.com", "552299887766", "999-8888", "123");
        User user2 = new User("Thaís2", "tlnunes2@thoughtworks.com", "5522987654321","999-0000", "321");
        List<User> users = Arrays.asList(user1, user2);

        Library library = new Library(items, users);
        List<Item> result = library.listAllItems();
        assertEquals(result, items);
    }


    @Test
    public void testListAvailableItems(){
        Book book1 = new Book(1,1999, "The Pragmatic Programmer", "Andy Hunt");
        Book book2 = new Book(2,2000, "Test Driven Development", "Kent Beck");
        Movie movie1 = new Movie(3,1998, "Titanic", 9, "James Cameron");
        Movie movie2 = new Movie(4,2001, "White Chicks",10, "Keenen Ivory Wayans" );


        List<Item> items = Arrays.asList(book1, book2, movie1, movie2);

        User user1 = new User("Thaís", "tlnunes@thoughworks.com", "552299887766", "999-8888", "123");
        User user2 = new User("Thaís2", "tlnunes2@thoughtworks.com", "5522987654321","999-0000", "321");

        List<User> users = Arrays.asList(user1, user2);

        Library library = new Library(items, users);
        library.checkoutItem(2);
        List <Item> result = library.listAvailableItems();
        assertEquals(result.size(), 3);
    }

    @Test
    public void testCheckoutItem(){
        Book book1 = new Book(1,1999, "The Pragmatic Programmer", "Andy Hunt");
        Movie movie1 = new Movie(3,1998, "Titanic", 9, "James Cameron");
        List<Item> items = Arrays.asList(book1, movie1);

        User user1 = new User("Thaís", "tlnunes@thoughworks.com", "552299887766", "999-8888", "123");
        User user2 = new User("Thaís2", "tlnunes2@thoughtworks.com", "5522987654321","999-0000", "321");

        List<User> users = Arrays.asList(user1, user2);

        Library library = new Library(items, users);
        library.checkoutItem(1);

        assertEquals(book1.isAvailable(), false);
    }

    @Test
    public void testReturnItem(){
        Book book1 = new Book(1,1999, "The Pragmatic Programmer", "Andy Hunt");
        Movie movie1 = new Movie(3,1998, "Titanic", 9, "James Cameron");
        List<Item> items = Arrays.asList();

        User user1 = new User("Thaís", "tlnunes@thoughworks.com", "552299887766", "999-8888", "123");
        User user2 = new User("Thaís2", "tlnunes2@thoughtworks.com", "5522987654321","999-0000", "321");

        List<User> users = Arrays.asList(user1, user2);

        Library library = new Library(items, users);

        library.returnItem(1);
        assertEquals(book1.isAvailable(), true);
    }

    @Test
    public void testLoginSuccess(){
        Boolean login;

        User user1 = new User("Thaís", "tlnunes@thoughworks.com", "552299887766", "999-8888", "123");
        User user2 = new User("Thaís2", "tlnunes2@thoughtworks.com", "5522987654321","999-0000", "321");
        List<User> users = Arrays.asList(user1, user2);
        List<Item> items = Arrays.asList();


        Library library = new Library(items, users);
        login = library.login("999-8888", "123");
        assertEquals(login, true);
    }

    @Test
    public void testLoginFailure(){
        Boolean login;

        User user1 = new User("Thaís", "tlnunes@thoughworks.com", "552299887766", "999-8888", "123");
        User user2 = new User("Thaís2", "tlnunes2@thoughtworks.com", "5522987654321","999-0000", "321");
        List<User> users = Arrays.asList(user1, user2);
        List<Item> items = Arrays.asList();


        Library library = new Library(items, users);
        login = library.login("888-0000", "123456");
        assertEquals(login, false);

    }

}
