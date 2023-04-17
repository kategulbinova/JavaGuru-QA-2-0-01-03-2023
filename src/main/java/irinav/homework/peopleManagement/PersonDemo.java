package irinav.homework.peopleManagement;

public class PersonDemo {
    public static void main(String[] args) {

    Person john = new Person("John");
    Person lara = new Person("Lara", 1980);

    john.setSurname("Pickwick");
    lara.setSurname("Holmes");

    System.out.println("Person 1");

    System.out.println("Name: " + john.name + " " + john.getSurname());
    System.out.println("Age: " + john.age);

    System.out.println("Employment: ");
    if (john.age >= 18) {
         john.hire();
        System.out.println("Name: " + john.name + " " + john.getSurname() + ", you can be hired!");
        } else {
          john.fire();
        System.out.println("Name: " + john.name + " " + john.getSurname() + ", you can't be hired!");
        }
        john.makeOlder();
        System.out.println("Happy birthday " + john.name + " you are " + john.age + " years old!");

        System.out.println();

        System.out.println("Person 2");
        System.out.println("Name: " + lara.name + " " + lara.getSurname());
        System.out.println("Age: " + lara.age);

        lara.makeOlder();
        System.out.println("Happy birthday " + lara.name + " you are " + lara.age + " years old!");

        System.out.println("Employment: ");

    if (lara.age >= 18) {
        lara.hire();
        System.out.println("Name: " + lara.name + " " + lara.getSurname() + ", you can be hired!");
        } else {
            lara.fire();
        System.out.println("Name: " + lara.name + " " + lara.getSurname() + ", you can be hired!");

           }
       }
          }
















