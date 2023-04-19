package natuksa.HomeworkHiringPerson;

public class PersonHire {
    public static void main (String[] args) {
        Person jane = new Person("Jane");
        Person john = new Person("John", 1995);
        jane.setSurname("Doe");
        john.setSurname("Smith");
        jane.checkAgeForHiring();
        john.checkAgeForHiring();
        jane.makeOlder();
        john.makeOlder();
        jane.checkAgeForHiring();
        john.checkAgeForHiring();
    }
}
