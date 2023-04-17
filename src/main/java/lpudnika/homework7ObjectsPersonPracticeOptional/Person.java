package lpudnika.homework7ObjectsPersonPracticeOptional;

import java.time.LocalDate;

public class Person {
    String name; //defining name
    String surname; //defining surname
    int age; //defining age
    int birthYear; //defining birth year

    public boolean isHired;

    public int getBirthYear() {
        return birthYear;
    }

    //If you pass the name and a birth year and, it will remember the person’s name and age
    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.age = LocalDate.now().getYear() - birthYear;
    }

    //If you pass the name only, the program will remember the person’s name and save 0 in the age (assuming the birth year is the same as the current year)
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 0;
    }

    //Create (and use) static method that will set people hiring status
    public static void setPeopleHiringStatus(Person[] people) {
        for (Person person : people) {
            if (person.age >= 18 && person.age <= 65) {
                person.isHired = true;
            } else {
                person.isHired = false;
            }
        }
    }

    //inctrease age by 1
    public void makeOlder() {
        this.age++;
    }

    //Create (and use) static method celebrateNewYear() that will take array of Person[] as a parameter and add 1 year to everyone using object method «makeOlder()». Also it should update hiring statuses of course.
    public static void celebrateNewYear(Person[] people) {
        for (Person person : people) {
            person.makeOlder();
        }
        setPeopleHiringStatus(people);
    }
    //return Surname of the person
    public String getSurname() {
        return surname;
    }

    //set Surname of the person
    public void setSurname(String surname) {
        this.surname = surname;
    }

    //printing result
    public String toString() {
        return "Person: " + "\n" +
                "name: " + name + "\n" +
                "surname: " + surname + "\n" +
                "age: " + age + "\n" +
                "hiring status: " + isHired + "\n";
    };

}
