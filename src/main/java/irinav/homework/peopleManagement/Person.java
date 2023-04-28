package irinav.homework.peopleManagement;

public class Person {
    String name;
    String surname;
    int age;
    boolean isHired;

    public Person(String name, int birthYear) {
        this.name = name;
        this.age = 2023 - birthYear;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void hire() {
        this.isHired = true;
    }

    public void fire() {
        this.isHired = false;
    }

    public void makeOlder() {
        age++;
        if (age >= 18) {
            isHired = true;
        } else {
            isHired = false;
        }
    }
}





