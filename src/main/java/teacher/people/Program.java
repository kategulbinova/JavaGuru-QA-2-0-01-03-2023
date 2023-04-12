package teacher.people;


public class Program {
    static void celebrateNewYear(Person[] people) {
        for (Person person : people) {
            person.makeOlder();
        }
        setHireStatuses(people);
    }

    static void setHireStatuses(Person[] people) {
        for (Person person : people) {
            if (person.age >= 18 && person.age <= 65) {
                person.hire();
            } else person.fire();
        }
    }

    public static void main(String[] args) {
        String[] names = {"Kate", "Michael", "Linda", "Kaspars", "Kristaps", "Olga", "Dmitry", "Nataly", "Liene", "Liene"};
        int[] birthYears = {0, 1981, 2006, 1956, 1999, 0, 2020, 2008, 1960, 1923};
        Person[] people = {null, null, null, null, null, null, null, null, null, null};

        for (int i = 0; i<names.length; i++) {
            if (birthYears[i] != 0) people[i] = new Person(names[i], birthYears[i]);
            else people[i] = new Person(names[i]);
        }

        setHireStatuses(people);

        for (Person person : people) {
            System.out.println(person.name + "; age " + person.age + ". Is hired now: " + person.status);
        }

        celebrateNewYear(people);
        for (Person person : people) {
            System.out.println(person.name + "; age " + person.age + ". Is hired now: " + person.status);
        }
    }
}
