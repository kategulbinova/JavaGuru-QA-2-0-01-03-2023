package YanaItani.Person;

public class personData {
    public static void main(String[] args) {
        PersonDetails personA = new PersonDetails("yana");
        System.out.println(personA.name);
        PersonDetails personB = new PersonDetails("Oreo", 2022);
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
        String[] chocolates = {"KitKat", "Maltesers", "Snickers", "Oreo", "Bounty", "Milka", "Hershey's", "Toblerone", "Mars", "Bueno"};
        int[] birthYear = {1997, 2000, 1990, 1975, 0, 1996, 2010, 2023, 1985,1955};
        PersonDetails [] people = {null, null, null, null, null, null, null, null, null, null};
        for (int i = 0; i < people.length; i++) {
            PersonDetails  k = new PersonDetails(chocolates[i], birthYear[i]);
                    people[i] = k;

        }
        PersonDetails.hiringStatus(people);
        PersonDetails.celebrateNewYear(people);

    }
}
