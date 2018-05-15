package com.twu.library;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    @Test
    public void testToString(){
        Book book = new Book("The Pragmatic Programmer");

        assertEquals(book.toString(), "The Pragmatic Programmer");
    }
}
