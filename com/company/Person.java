package com.company;

/**
 * Created by madooding on 9/23/2017 AD.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public void speak(String words){
        System.out.println(words);
    }

    public void speak(String words, int times){
        for(int i = 0; i < times; i++){
            System.out.println(words);
        }
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
