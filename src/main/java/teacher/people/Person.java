package teacher.people;

public class Person {
    String name;
    String surname;
    int age;
    boolean status = false; // hired or not
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.age = 2023 - birthYear;
    }

    public void hire() {
        this.status = true;
    }

    public void fire() {
        this.status = false;
    }

    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void makeOlder() {
        this.age++;
    }
}
