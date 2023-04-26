package paula.Homework6PersonAgeWork;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Paula");
        person1.setSurname("Cvikova");

        System.out.println("Name: " + person1.name);
        System.out.println("Surname: " + person1.getSurname());
        System.out.println("Age: " + person1.age);

        Person person2 = new Person("Roman", 1987);
        person2.setSurname("Zaicevs");

        System.out.println();
        System.out.println("Name: " + person2.name);
        System.out.println("Surname: " + person2.getSurname());
        System.out.println("Age: " + person2.age);

        if (person2.getAge() > 18) {
            person2.hire();
        }

        person1.makeOlder();
        person2.makeOlder();

        System.out.println();
        System.out.println("Happy Birthday " + person1.getName() + " " + person1.getSurname() + " you are " + person1.getAge() + " years old and you are " + (person1.getIsHired() ? "hired" : "not hired."));
        System.out.println("Happy Birthday " + person2.getName() + " " + person2.getSurname() + " you are " + person2.getAge() + " years old and you are " + (person2.getIsHired() ? "hired" : "not hired."));

        }
}