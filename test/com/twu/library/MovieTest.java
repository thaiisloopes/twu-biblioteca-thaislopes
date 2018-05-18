package com.twu.library;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MovieTest {
    @Test
    public void testToString(){
        Movie movie = new Movie(1,"Titanic", 1998, "James Cameron", 9);

        assertEquals(movie.toString(),"1 - Titanic, 1998, James Cameron, 9");
    }
}
