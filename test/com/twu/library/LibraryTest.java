package com.twu.library;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testListAllBooks(){
        List<Book> books = Arrays.asList(
                new Book(1, "The Pragmatic Programmer", "Andy Hunt", 1999),
                new Book(2, "Test Driven Development", "Kent Beck", 2000)
        );
        Library library = new Library(books);
        List<Book> result = library.listAllBooks();
        assertEquals(result, books);
    }


    @Test
    public void testListAvailableBooks(){
        Book book1 = new Book(1, "The Pragmatic Programmer", "Andy Hunt", 1999);
        Book book2 = new Book(2, "Test Driven Development", "Kent Beck", 2000);

        List<Book> books = Arrays.asList(book1, book2);

        Library library = new Library(books);
        library.checkoutItem(2);
        List <Book> result = library.listAvailableBooks();
        assertEquals(result.size(), 1);
        assertEquals(result.get(0), book1);
    }

    @Test
    public void testCheckoutItem(){
        Book book1 = new Book(1, "The Pragmatic Programmer", "Andy Hunt", 1999);
        List<Book> books = Arrays.asList(book1);

        Library library = new Library(books);
        library.checkoutItem(1);

        assertEquals(book1.isAvailable(), false);
    }

    @Test
    public void testReturnBook(){
        Book book1 = new Book(1, "The Pragmatic Programmer", "Andy Hunt", 1999);
        List<Book> books = Arrays.asList();

        Library library = new Library(books);

        library.returnBook(1);
        assertEquals(book1.isAvailable(), true);
    }

}
