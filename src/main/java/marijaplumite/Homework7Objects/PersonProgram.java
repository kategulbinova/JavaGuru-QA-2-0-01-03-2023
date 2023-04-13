package marijaplumite.Homework7Objects;

public class PersonProgram {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Kate";
        person1.setSurname("Petrova");


        System.out.println("First person: ");
        System.out.println("Name: " + person1.name);
        System.out.println("Surname: " + person1.getSurname());
        System.out.println("Age: " + person1.getAge());
        System.out.print("Employment status: ");
        person1.hired();
        person1.fired();
        person1.makeOlder();
        System.out.println("Yesterday was " + person1.name + "`s birthday, so now she is " + person1.age + " year(s) old. Wishing a very happy birthday! ");
        System.out.println();

            Person person2 = new Person();
            person2.name = "Marija";
            person2.birthYear = 2002;
            person2.setSurname("Sidorova");

        System.out.println("Second person: ");
        System.out.println("Name: " + person2.name);
        System.out.println("Surname: " + person2.getSurname());
        person2.calculateAge();
        System.out.println("Age: " + person2.getAge());
        System.out.print("Employment status: ");
        person2.hired();
        person2.fired();
        person2.makeOlder();
        System.out.println("Day before yesterday was " + person2.name + "`s birthday, so now she is " + person2.age + " year(s) old. Wishing a very happy birthday! ");
        System.out.println();

            Person person3 = new Person();
            person3.name = "Jay";
            person3.setSurname("Nolan");
            person3.setAge(45);

        System.out.println("Third person: ");
        System.out.println("Name: " + person3.name);
        System.out.println("Surname: " + person3.getSurname());
        System.out.println("Age: " + person3.getAge());
        System.out.print("Employment status: ");
        person3.hired();
        person3.fired();
        person3.makeOlder();
        System.out.println("Recently " + person3.name + " " + person3.getSurname() + " celebrated his birthday, so now he is " + person3.age + " year(s) old. Wishing all the best!");
        System.out.println();
    }
}
