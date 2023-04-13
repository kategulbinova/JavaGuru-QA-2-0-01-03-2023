package marijaplumite.Homework7Objects;

public class Person {
    String name;
    String surName;
    int birthYear;
    int age;
    boolean isHired; // true - is hired, false - not hired
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
    public void calculateAge(){
        age = 2023 - this.birthYear;
    }
    public void hired(){
    this.isHired = true;
        if (this.age >= 18) {
            System.out.println("Hired");
        }
    }
    public void fired(){
        this.isHired = false;
        if (this.age < 18) {
            System.out.println("Not Hired, too young!");
        }
    }
    public void makeOlder() {
        this.age++;
    }
    public String getSurname() {
        return this.surName;
    }
    public void setSurname(String surName) {
        this.surName = surName;
    }

}
