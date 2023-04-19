package AlekseiKrevnev.Homeworks.Constructors;



public class Person {
    String name;
    String surname;
    int age;
    Boolean isHired;

    public Person(int birthYear, String name) {
        this.name=name;
        this.age=2023-birthYear;
    }
    public Person(String name) {
        this.name=name;
        this.age =0;
    }
    public void hire() {
        this.isHired=true;
    }
    public void fire() {
        this.isHired=false;
    }
    public void makeOlder() {
        this.age++;
    }
    public void setSurname(String surname) {
        this.surname=surname;
    }
    public String getSurname() {
        return surname;
    }
}
