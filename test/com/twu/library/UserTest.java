package com.twu.library;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserTest {
    @Test
    public void testListCustomersInformation(){
        String informationList;
        User userLogged = new User("Thaís", "tlnunes@thoughworks.com", "552299887766", "999-8888", "123");
        informationList = userLogged.listCustomersInformation();
        assertEquals(informationList, ("User Informations:\n\nName: " + userLogged.getName() + "\nE-mail Adress: " +
                userLogged.getEmailAdress() + "\nPhone Number: " + userLogged.getPhoneNumber() + "\n")
        );
    }

}
