package lpudnika.homework7ObjectsPersonPractice;

import java.time.LocalDate; //searched in google how to import year automatically

public class Person {

    String name; //defining name

    String surname; //defining surname

    int age; //defining age

    int birthYear; //defining birth year

    boolean isHired; //defining boolean

    public int getBirthYear() {
        return birthYear;
    }
    //If you pass the name and a birth year and, it will remember the person’s name and age
    public Person(String name, int birthYear) {
        this.name = name;
        this.age = LocalDate.now().getYear() - birthYear;
    }

    //If you pass the name only, the program will remember the person’s name and save 0 in the age (assuming the birth year is the same as the current year)
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    //amend the field isHired so that the person appears to be hired.
    public void hire () {
        if (age >= 18 || age <= 65) {
            this.isHired = true;
        }
    }

    //amend the field isHired so that the person appears to be not hired.
    public void fire () {
        if (age <18 || age >65) {
            this.isHired = false;
        }
    }

    //inctrease age by 1
    public void makeOlder() {
        this.age++;
    }

    //return Surname of the person
    public String getSurname() {
        return surname;
    }

    //set Surname of the person
    public void setSurname(String surname) {
        this.surname = surname;
    }

}
