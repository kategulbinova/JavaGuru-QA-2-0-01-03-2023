package svetlanakussi.homework.homework7objects;

public class Person {
    String name;
    String surname;
    int age;
    Boolean isHired;
    Person(String name, int birthYear) {
        this.name = name;
        this.age = 2023 - birthYear;
    }

    Person(String name) {
        this.name = name;
        this.age = 0;
    }
    public void hire() {
        isHired = true;
    }

    public void fire() {
        isHired = false;
    }

    public void makeOlder() {
        age++;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

