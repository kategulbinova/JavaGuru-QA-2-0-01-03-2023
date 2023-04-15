package irinav.objectsHW7;

public class PersonDemo {
    public static void main(String[] args) {

        Person person1 = new Person("John");
        person1.setSurname("Pickwick");

        System.out.println("Name: " + person1.name + " " + person1.getSurname());
        System.out.println("Age: " + person1.age);

        System.out.println("Employment: " );
        person1.hire();
        person1.fire();

        person1.makeOlder();
        System.out.println("Happy birthday " + person1.name + " you are " + person1.age + " years old!");

        Person person2 = new Person("Lara", 1980);
        person2.setSurname("Holmes");

        System.out.println();

        System.out.println("Name: " + person2.name + " " + person1.getSurname());
        System.out.println("Age: " + person2.age);
        System.out.println("Employment: ");
        person2.hire();
        person2.fire();

        person2.makeOlder();
        System.out.println("Happy birthday " + person2.name + " you are " + person2.age + " years old!");

    }

}
