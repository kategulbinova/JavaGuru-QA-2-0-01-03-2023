package bashar.lesson7.homeworkTaskOne;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Name");
        Person person2 = new Person("Bashar", 1993);

        person1.setSurname("Person1Surname");
        System.out.println(person1.surname);

        person2.setSurname("Al");
        System.out.println(person2.surname);


        if (person1.age > 18) {
            System.out.println("You are hired!");
        } else {
            System.out.println("Not hired!");
        }

        if (person2.age > 18) {
            System.out.println("You are hired!");
        } else {
            System.out.println("Not hired!");
        }

        person1.makeOlder();
        person2.makeOlder();

    }
}
