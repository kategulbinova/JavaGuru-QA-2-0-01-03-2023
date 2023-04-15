package irinav.objectsHW7;

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
        age = 0;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void hire() {
        this.isHired = true;
        if (this.age >= 18) {
            System.out.println("This person is employed!");
        }
    }

   public void fire() {
            this.isHired = false;
            if (this.age < 18) {
                System.out.println("This person is not employed!");
            }
        }
   public void makeOlder () {
        this.age++;
        }
    }







