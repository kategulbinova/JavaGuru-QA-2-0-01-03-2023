package aleksejs_lukins.Homework7ObjectsBuildingPerson;

public class Person {

    String name;
    String surname;
    int age;
    boolean isHired;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(String name){
        this.name = name;
        this.age = 0;
    }

    void hire(){
        this.isHired = true;
    }

    void fire(){
        this.isHired = false;
    }

    void makeOlder(){
        this.age++;
    }

    void setSurname(String surname){
        this.surname = surname;
    }

    String getSurname(){
        return this.surname;
    }
}
