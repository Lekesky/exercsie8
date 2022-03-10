package com.company;

import java.util.ArrayList;

public class ContactBook {
    public ArrayList<Contact> book = new ArrayList();


    public void add(Contact c){
        book.add(c);
    }


    @Override
    public String toString() {
        return "ContactBook{" + book + '}';
    }

    public void display(){for(Contact a : book){
        System.out.println(a.toString());
    }

    }



}
