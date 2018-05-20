package com.twu.library;

public class User {
    private String name, emailAdress, phoneNumber, libraryNumber, password;

    public User(String name, String emailAdress, String phoneNumber, String libraryNumber, String password) {
        this.name = name;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String listCustomersInformation(){
        return ("User Informations:\n\nName: " + this.getName() + "\nE-mail Adress: " + this.getEmailAdress() + "\nPhone Number: " + this.getPhoneNumber() + "\n");
    }

}
