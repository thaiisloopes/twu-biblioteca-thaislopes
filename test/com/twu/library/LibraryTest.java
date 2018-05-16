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
    public void testAvailableBooksList(){
        List<Book> books = Arrays.asList(
                new Book(1, "The Pragmatic Programmer", "Andy Hunt", 1999),
                new Book(2, "Test Driven Development", "Kent Beck", 2000)
        );
        books.get(1).setAvailable(false);
        Library library = new Library(books);
        List <Book> result = library.listAvailableBooks();
        assertEquals(result.toString(), "1 - The Pragmatic Programmer, Andy Hunt, 1999");
    }

}
