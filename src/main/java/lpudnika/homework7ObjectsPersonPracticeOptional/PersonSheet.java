package lpudnika.homework7ObjectsPersonPracticeOptional;

import java.time.LocalDate;

public class PersonSheet {
    public static void main(String[] args) {
        // Create an array of  min 10 names (of type String)
        String[] names = {"Elizabete", "Olivija", "Marija", "Eduards", "Rafaels", "Linda", "Franceska", "Anne", "Klavs", "Jana"};
        String[] surnames = {"Ozolina", "Berzina", "Gulbe", "Kalnins", "Lacis", " ", "Gulbe", "", "Priede", ""};

        //Create an array of min 10 birth years (of type int) – some should be 0
        int[] birthYears = {1995, 2024, 0, 1978, 1875, 1945, 1956, 1997, 2015, 0};

        //Create an array of min 10 people (of type Person) – initially set all nulls (we can’t change array size dynamically)
        Person[] people = new Person[10];
        for (int i = 0; i < 10; i++) {
           if (birthYears[i] == 0) {
              people[i] = new Person(names[i], surnames[i]);
           } else {
              people[i] = new Person(names[i], surnames[i], birthYears[i]);
           }
        }

        Person.setPeopleHiringStatus(people);

        System.out.println("This year: ");
        for (Person person : people) {
            System.out.println(person);
        }

        Person.celebrateNewYear(people);

        System.out.println("Next year: ");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
