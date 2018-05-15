package com.twu.library;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testListAllBooks(){
        List<Book> books = Arrays.asList(new Book("The Pragmatic Programmer"), new Book("Test Driven Development"));
        Library library = new Library(books);
        List<Book> result = library.listAllBooks();
        assertEquals(result, books);
    }



}
