package com.company;

/**
 * Created by madooding on 9/23/2017 AD.
 */
public class BadPerson extends Person{
    public BadPerson(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    public void speak(String words){
        System.out.println("Fuck !! " + words);
    }
}
