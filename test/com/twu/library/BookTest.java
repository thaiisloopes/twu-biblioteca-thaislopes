package com.twu.library;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    @Test
    public void testToString(){
        Book book = new Book(1,"The Pragmatic Programmer", "Andy Hunt", 1999);

        assertEquals(book.toString(),"1, The Pragmatic Programmer, Andy Hunt, 1999");
    }
}
