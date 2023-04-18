package romans.makna;

public class Objects package com.example;

        import java.time.Year;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean isHired;

    // Constructor 1: If you pass the name and a birth year, it will remember the person’s name and age
    public Person(String name, int birthYear) {
        this.name = name;
        this.surname = "";
        this.age = Year.now().getValue() - birthYear;
        this.isHired = false;
    }

    // Constructor 2: If you pass the name only, the program will remember the person’s name and save 0 in the age
    public Person(String name) {
        this.name = name;
        this.surname = "";
        this.age = 0;
        this.isHired = false;
    }

    public void hire() {
        this.isHired = true;
    }

    public void fire() {
        this.isHired = false;
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

