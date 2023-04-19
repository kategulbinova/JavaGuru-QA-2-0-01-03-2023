package Kristiana.ObjectPersonHomework;

public class program {
    public static void main(String[] args) {
        // create two persons with names and birth years
        Person person1 = new Person("Alice", 2009);
        Person person2 = new Person("Luiza", 1997);

        // set surnames for both
        person1.setSurname("Petrova");
        person2.setSurname("Ivanova");

        // hire them if age > 18
        if (person1.getAge() > 18) {
            person1.hire();
            System.out.println(person1.getName() + " " + person1.getSurname() + " is hired.");
        } else {
            System.out.println(person1.getName() + " " + person1.getSurname() + " is not hired.");

            if (person2.getAge() > 18) {
                person2.hire();
                System.out.println(person2.getName() + " " + person2.getSurname() + " is hired.");
            } else {
                System.out.println(person1.getName() + " " + person1.getSurname() + " is not hired.");

            }

            // celebrate birthdays for both
            person1.makeOlder();
            System.out.println(person1.getName() + " " + person1.getSurname() + " is now " + person1.getAge() + " years old.");


            System.out.println(person2.getName() + " " + person2.getSurname() + " is now " + person2.getAge() + " years old.");


        }
    }
}