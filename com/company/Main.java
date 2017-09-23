package com.company;

public class Main {

    public static void main(String[] args){
        Person person1 = new GoodPerson("Peter", "McCarawelle", 40);

        GoodPerson goodPerson = new GoodPerson("Dhamma", "Chayo", 50);

        if(person1 instanceof GoodPerson){
            ((GoodPerson) person1).walkJongkrom();
        }
    }
}
