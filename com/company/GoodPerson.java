package com.company;

/**
 * Created by madooding on 9/23/2017 AD.
 */
public class GoodPerson extends Person {

    public GoodPerson(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public void speak(String words){
        System.out.println("Good !! " + words);
    }

    public void walkJongkrom(){
        System.out.println(getFirstName() + " is walking.");
    }

}