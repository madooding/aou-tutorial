package com.company;

/**
 * Created by madooding on 9/25/2017 AD.
 */
public class ClassRoom {
    private Person[] persons;
    private int countPerson;
    private String subject;
    private String teacher;

    public ClassRoom(String subject, String teacher){
        this.persons = new Person[10];
        this.setSubject(subject);
        this.setTeacher(teacher);
    }

    public void enroll(Person person){
        persons[countPerson] = person;
        this.countPerson++;
    }

    public Person getStudent(int index){
        return persons[index];
    }

    public int getStudentAmount(){
        return countPerson;
    }


    public void showAllStudents(){
        for(int i = 0; i < getStudentAmount(); i++){
            Person person = persons[i];
            if(person instanceof GoodPerson){
                System.out.println(person.getFirstName() + " is Good Person.");
            }else if(person instanceof BadPerson){
                System.out.println(person.getFirstName() + " is Bad Person.");
            }else{
                System.out.println(person.getFirstName() + " is Normal Person.");
            }
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
