package germans.HomeworkObjectPerson;

public class MainForPerson {
    public static void main(String[] args) {
        Person firstPerson = new Person("John",2006);
        firstPerson.setSurname("Smith");

        System.out.println("Name: " + firstPerson.name);
        System.out.println("Surname: " + firstPerson.getSurname());
        System.out.println("Age: " + firstPerson.age);
        firstPerson.IsHired();
        firstPerson.getOlder();
        System.out.println("Happy birthday " + firstPerson.name + " you are " + firstPerson.age + " years old!");

        Person secondPerson = new Person("Petris", 1982);
        secondPerson.setSurname("Ozolins");

        System.out.println();

        System.out.println("Name: " + secondPerson.name);
        System.out.println("Surname: " + secondPerson.getSurname());
        System.out.println("Age: " + secondPerson.age);
        secondPerson.IsHired();;
        secondPerson.getOlder();
        System.out.println("Happy birthday " + secondPerson.name + " you are " + secondPerson.age + " years old!");


    }
}




