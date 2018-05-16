package com.twu.library;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MenuTest {
    @Test
    public void testShowMenu(){
       Menu menu = new Menu();

       assertEquals(menu.showMenu(), "Please select an option: \n 1 - List all available books \n 2 - Exit \n");
    }
}
