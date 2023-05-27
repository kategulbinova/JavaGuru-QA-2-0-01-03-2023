package kristiana.ObjectPersonHomework;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int birthYear;

    boolean isHired; // true = hired ; false = not hired

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.age = 2023 - birthYear;

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
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
