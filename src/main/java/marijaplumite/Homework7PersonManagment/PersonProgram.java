package marijaplumite.Homework7PersonManagment;

public class PersonProgram {
    public static void main(String[] args) {
            Person person1 = new Person("Marija");
            Person person2 = new Person("Jay", 1953);
            Person person3 = new Person("Kate", 1996);

            person1.setSurname("Sidorova");
            person2.setSurname("Nolan");
            person3.setSurname("Wild");
            person1.updateHiringStatus();
            person2.updateHiringStatus();
            person3.updateHiringStatus();

            System.out.println("Person 1:");
            System.out.println("Name: " + person1.getName());
            System.out.println("Surname: " + person1.getSurname());
            System.out.println("Birth year: " + person1.getBirthYear());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Hired: " + person1.isHired());

            System.out.println();

            System.out.println("Person 2:");
            System.out.println("Name: " + person2.getName());
            System.out.println("Surname: " + person2.getSurname());
            System.out.println("Birth year: " + person2.getBirthYear());
            System.out.println("Age: " + person2.getAge());
            System.out.println("Hired: " + person2.isHired());

            System.out.println();

            System.out.println("Person 3:");
            System.out.println("Name: " + person3.getName());
            System.out.println("Surname: " + person3.getSurname());
            System.out.println("Birth year: " + person3.getBirthYear());
            System.out.println("Age: " + person3.getAge());
            System.out.println("Hired: " + person3.isHired());

            System.out.println();

            System.out.println("Celebrated birthdays :");
            person1.makeOlder();
            person2.makeOlder();

            System.out.println();

            System.out.println("Person 1:");
            System.out.println("Name: " + person1.getName());
            System.out.println("Surname: " + person1.getSurname());
            System.out.println("Birth year: " + person1.getBirthYear());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Hired: " + person1.isHired());

            System.out.println();

            System.out.println("Person 2:");
            System.out.println("Name: " + person2.getName());
            System.out.println("Surname: " + person2.getSurname());
            System.out.println("Birth year: " + person2.getBirthYear());
            System.out.println("Age: " + person2.getAge());
            System.out.println("Hired: " + person2.isHired());

            System.out.println();

            System.out.println("Person 3:");
            System.out.println("Name: " + person3.getName());
            System.out.println("Surname: " + person3.getSurname());
            System.out.println("Birth year: " + person3.getBirthYear());
            System.out.println("Age: " + person3.getAge());
            System.out.println("Hired: " + person3.isHired());
        }
}
