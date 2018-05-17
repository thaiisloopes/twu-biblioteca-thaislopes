package com.twu.library;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MenuTest {
    @Test
    public void testShowMenu(){
       Menu menu = new Menu();

       assertEquals(menu.showMenu(), "Please select an option: " +
               "\n1 - List All Available Books " +
               "\n2 - Checkout Book " +
               "\n3 - Return Book " +
               "\n4 - Quit \n"
       );
    }
}
