package romans.makna;

import java.time.Year;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean isHired;

    public Person(String name, int birthYear) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
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

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Jane", 1990);
        person1.setSurname("Doe");
        person2.setSurname("Smith");

        if (person1.age > 18) {
            person1.hire();
        }
        if (person2.age > 18) {
            person2.hire();
        }

        person1.makeOlder();
        person2.makeOlder();

        System.out.println("Person 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Surname: " + person1.getSurname());
        System.out.println("Age: " + person1.age);
        System.out.println("Is hired: " + person1.isHired);

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.name);
        System.out.println("Surname: " + person2.getSurname());
        System.out.println("Age: " + person2.age);
        System.out.println("Is hired: " + person2.isHired);
    }
}
