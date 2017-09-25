package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by madooding on 9/25/2017 AD.
 */
public class Building {
    private List<Person> persons;
    private String name;
    private int levels = 56;

    public Building(String name){
        this.setName(name);
        persons = new ArrayList<>();
    }

    public Building(String name, int levels){
        this.setName(name);
        this.setLevels(levels);
        persons = new ArrayList<>();
    }

    public void enter(Person person){
        if(person instanceof  BadPerson){
            System.out.println(person.getFirstName() + ", You don't have permission.");
        }else{
            System.out.println("Welcome!, " + person.getFirstName() + ".");
            persons.add(person);
        }
    }

    public int countPerson(){
        return persons.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }
}
