package myPackage;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean isHired;

    public Person(String name, int birthYear) {
        this.name = name;
        this.age = LocalDate.now().getYear() - birthYear;
        this.surname = "";
        this.isHired = false;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.surname = "";
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHired() {
        return isHired;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 2000);

        person1.setSurname("Smith");
        person2.setSurname("Jones");

        if (person1.getAge() > 18) {
            person1.hire();
        }
        if (person2.getAge() > 18) {
            person2.hire();
        }

        System.out.println(person1.getName() + " " + person1.getSurname() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " " + person2.getSurname() + " is " + person2.getAge() + " years old.");

        person1.makeOlder();
        person2.makeOlder();

        System.out.println(person1.getName() + " " + person1.getSurname() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " " + person2.getSurname() + " is " + person2.getAge() + " years old.");

        person1.fire();

        System.out.println(person1.getName() + " " + person1.getSurname() + " is " + (person1.isHired() ? "hired" : "not hired") + ".");
        System.out.println(person2.getName() + " " + person2.getSurname() + " is " + (person2.isHired() ? "hired" : "not hired") + ".");
    }
}
