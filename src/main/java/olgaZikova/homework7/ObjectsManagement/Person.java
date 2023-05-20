package olgaZikova.homework7.ObjectsManagement;

public class Person {
    /*3. Inside this class define fields:
name -- String
surname -- String
age -- int
isHired – boolean (hired or not)
4. Create 2 (or at least one) distinct constructors:
If you pass the name and a birth year and, it will remember the person’s name and age
If you pass the name only, the program will remember the person’s name and save 0 in the age (assuming the birth year is the same as the current year) (optional)
*/

    private String name;
    private String surname;
    private int age;
    private boolean isHired;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println();
        System.out.println("Person name is " + name +".");
        System.out.println("Person birth year is " + (2023-age)+".");
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;

        System.out.println();
        System.out.println("Person name is " + name);
        System.out.println("Person age is " + age);
    }
    /*5. Define following methods:
    hire() – amend the field isHired so that the person appears to be hired.
    fire() – amend the field isHired so that the person appears to be not hired.
            makeOlder() – inctrease age by 1.
    getSurname() – return Surname of the person.
    setSurname() – set Surname of the person.*/

    public boolean isHired () {

        return isHired;
    }

    public void getHired () {
        if (this.age>=18 && this.age<=64) {
            this.isHired = true;
            System.out.println("Person can be hired.");
        }
        else {
            this.isHired = false;
            System.out.println("The person is not acceptable for hiring.");
        }
    }

    public void getFired () {
        if (this.age > 64) {
            System.out.println("The person have to be fired.");
        }
    }
    public void getOlder () {
        this.age ++;
        System.out.println("The person will celebrate " + age + " years.");
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
        System.out.println("The person surname is " + surname + ".");
    }

}