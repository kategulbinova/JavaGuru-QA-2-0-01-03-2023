package lpudnika.homework7ObjectsPersonPractice;

public class PersonSheet {

    public static void main(String[] args) {
        Person person1 = new Person ("Anna"); //Create new person – only use the name
        Person person2 = new Person ("Olivija", 2022); //Create another person – use both the name and the birth year
        Person person3 = new Person ("Marts", 1995);

        //Set surnames for both
        person1.setSurname("Pudnika");
        person2.setSurname("Okincica");
        person3.setSurname("Ivanovs");

        //If the age is > 18 then hire them
        person1.hire();
        person1.fire();
        person2.hire();
        person2.fire();
        person3.hire();
        person3.fire();

        //Celebrate birthdays for both
        person1.makeOlder();
        person2.makeOlder();


        //person 1
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Surname: " + person1.surname);
        System.out.println("Age: " + person1.age);
        System.out.println("Birth Year: " + person1.birthYear);
        System.out.println("Is hired: " + person1.isHired);
        System.out.println();

        //person 2
        System.out.println("Person 2:");
        System.out.println("Name: " + person2.name);
        System.out.println("Surname: " + person2.surname);
        System.out.println("Age: " + person2.age);
        System.out.println("Birth Year: " + person2.birthYear);
        System.out.println("Is hired: " + person2.isHired);
        System.out.println();

        //birthdays
        System.out.println("Happy birthday " + person1.name + " (" + person1.age + ") and " + person2.name + " (" + person2.age + ") !");
        System.out.println();

        //person 3
        System.out.println("Person 3:");
        System.out.println("Name: " + person3.name);
        System.out.println("Surname: " + person3.surname);
        System.out.println("Age: " + person3.age);
        System.out.println("Birth Year: " + person3.birthYear);
        System.out.println("Is hired: " + person3.isHired);
        System.out.println();

    }
}
