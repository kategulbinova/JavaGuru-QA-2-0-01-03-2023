package bashar.lesson7.homeworkTaskOne;

public class Person {
    /*name -- String
surname -- String
age -- int
isHired – boolean (hired or not)*/
    String name;
    String surname;
    int age;
    boolean isHired;

    public Person(String name, String surname, int age, boolean isHired) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isHired = isHired;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.age = 2023 - birthYear;
    }

    public Person(String name) {
        int birthYear = 2023;
        this.name = name;
        this.age = 2023 - birthYear;

    }

    public void hire() {
        System.out.println("Hired? " + this.isHired);
    }

    public void fire() {
        boolean notHired = !isHired;
        System.out.println("Hired? " + notHired);
    }

    public void makeOlder() {
        System.out.println(this.age + 1);
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
