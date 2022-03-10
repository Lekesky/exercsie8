package com.company;

import java.util.Scanner;

public class Main {
    static ContactBook contactBook = new ContactBook();
    static Scanner input = new Scanner(System.in);
    static String name;
    static String email;
    static Long phoneNumber;

    public static void main(String[] args) {
        Contact contactInfo = new Contact("james", "something@gmail.com");
        Business businessInfo = new Business("john", "john@gmail.com", 12343453L);

        contactBook.add(contactInfo);
        contactBook.add(businessInfo);
        contactBook.display();


    }
}
