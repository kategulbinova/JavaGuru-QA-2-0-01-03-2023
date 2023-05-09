package margo.homeWorks.lect7ObjectPerson;

public class Person {
    String name;
    private String surname;
    int age;
    boolean isHired;
    public Person() {}
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.age = 2023 - yearOfBirth;
    }
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }
    public void hire() {
        if (this.age > 18) {
            this.isHired = true;
            System.out.println("Candidate over 18 years old. Can be hired!");
        }
    }
    public void fire() {
        if (this.age < 18) {
            this.isHired = false;
            System.out.println("Candidate under 18 years old. Cannot be hired!");
        }
    }
    public void makeOlder() {
        this.age++;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
