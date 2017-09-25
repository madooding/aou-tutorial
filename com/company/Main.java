package com.company;

public class Main {

    public static void main(String[] args){
        Person person1 = new GoodPerson("Peter", "McCarawelle", 40);

        GoodPerson goodPerson = new GoodPerson("Dhamma", "Chayo", 50);

        BadPerson badPerson = new BadPerson("Prayuth", "Chan-o-cha", 62);

        Person person = new Person("Manop", "Punkokkruad", 42);

        ClassRoom oopClass = new ClassRoom("OOP", "Thanisa Numnonda");

        System.out.println(oopClass.getStudentAmount());

        oopClass.enroll(person);

        System.out.println(oopClass.getStudentAmount());

        oopClass.enroll(badPerson);

        oopClass.showAllStudents();

        Building building = new Building("Baiyok");

        building.enter(goodPerson);

        building.enter(badPerson);

        System.out.println("There are " + building.countPerson() + " person(s) right now.");

    }
}
