package YanaItani.Person;

public class PersonData {
    public static void main(String[] args) {
        Person personA = new Person("yana");
        System.out.println(personA.name);
        Person personB = new Person("Oreo", 2022);
        System.out.println(personB.name);
        personA.setSurname("Itani");
        System.out.println(personA.getSurname());
        personB.setSurname("theCat");
        System.out.println(personB.getSurname());
        if (personB.age > 18) {
            personB.hire();
        }
        System.out.println(personB.name + " is " + personB.isHired);
        personA.makeOlder();
        System.out.println(personA.name + "'s age is " + personA.age);
        personB.makeOlder();
        System.out.println(personB.name + "'s age is " + personB.age);
        String[] peopleNames = {"Liam", "Olivia", "Noah", "Emma", "Oliver", "Charlotte", "Amelia", "William", "Sophia", "Benjamin"};
        int[] birthYear = {1997, 2000, 1990, 1975, 0, 1996, 2010, 2023, 1985,1955};
        Person[] people = {null, null, null, null, null, null, null, null, null, null};
        for (int i = 0; i < peopleNames.length; i++) {
            Person k = new Person(peopleNames[i], birthYear[i]);
            people[i] = k;
        }

        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            person.setHiringStatus();
        }
        Person.celebrateNewYear(people);
    }
}
