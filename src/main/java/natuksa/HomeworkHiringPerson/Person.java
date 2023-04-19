package natuksa.HomeworkHiringPerson;

public class Person {
    String name;
    private String surname;
    int age;
    boolean isHired;
    static int currentYear = 2023;
    public Person(String name, int birthYear) {
        this.name = name;
        this.age = currentYear - birthYear;
    }
    public Person(String name) {
        this.name = name;
        this.age = currentYear - currentYear;
    }
    public void hire() {
        this.isHired = true;
    }
    public void fire() {
        isHired = false;
    }
    public void makeOlder() {
        this.age++;
        System.out.println("Happy birthday, " +name+ " " +surname+  ". You are now " +age+ " years old.");
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
        System.out.println("Hello, " +this.name+ " " +this.surname+ "!");
    }
    public void checkAgeForHiring() {
        if (age < 18 || age > 65) {
            fire();
            System.out.println("Sorry, " +name+ " " +surname+ ", but we can not hire you, because you are " +age+ " years old.");
        } else {
            hire();
            System.out.println("Dear, " +name+ " " +surname+  ", you are hired. You are " +age+ " years old, and you meet our requirements.");
        }
    }
}
