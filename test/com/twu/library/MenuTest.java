package com.twu.library;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MenuTest {
    @Test
    public void testShowMenu(){
       Menu menu = new Menu();

       assertEquals(menu.showMenu(), "Please select an option: " +
               "\n1 - List Customer's Information " +
               "\n2 - List All Available Items " +
               "\n3 - Checkout Item " +
               "\n4 - Return Item " +
               "\n5 - Quit \n"
       );
    }
}
