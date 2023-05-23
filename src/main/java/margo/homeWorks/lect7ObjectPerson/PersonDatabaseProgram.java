package margo.homeWorks.lect7ObjectPerson;

public class PersonDatabaseProgram {
    public static void main(String[] args) {
        //Person 1
        Person male = new Person("Doctor");
        System.out.println("Candidate 1: Name is " + male.name + ", age is " + male.age);
        male.setSurname("Pepper");
        System.out.println("Candidate 1: Surname is " + male.getSurname());
        male.hire();
        male.fire();
        male.makeOlder();
        System.out.println("It's Candidate's 1 Birthday! The age is now " + male.age + " years old ");

        System.out.println();

        //Person 2
        Person female = new Person("Aphrodite", 1234);
        System.out.println("Candidate 2: Name is " + female.name + ", age is " + female.age);
        female.setSurname("Argennis");
        System.out.println("Candidate 2: Surname is " + female.getSurname());
        female.hire();
        female.fire();
        female.makeOlder();
        System.out.println("It's Candidate's 2 Birthday! The age is now " + female.age + " years old ");



    }
}
