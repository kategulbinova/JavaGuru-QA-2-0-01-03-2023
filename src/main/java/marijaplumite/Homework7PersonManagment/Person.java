package marijaplumite.Homework7PersonManagment;

import java.time.LocalDate; // used Google to find a way how to get local date.

public class Person {
    private String name;
    private String surname;
    private int age;
    private int birthYear;
    private boolean isHired = true;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.surname = "";
        this.age = LocalDate.now().getYear() - birthYear;
    }

    public Person(String name) {
        this(name, LocalDate.now().getYear());
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

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return age;
    }
    public boolean isHired() {
        return isHired;
    }
    public void updateHiringStatus() {
        if (age >= 18 && age <= 65) {
            this.isHired = true;
        } else {
         this.isHired = false;
        }
    }
}

