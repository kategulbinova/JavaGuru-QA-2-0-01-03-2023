package AlekseiKrevnev.Homeworks.Constructors;

public class PersonDates {
    public static void main(String[] args) {
        Person aleksej = new Person(1902, "Aleksej");
        Person andrew = new Person("Andrew");
        aleksej.setSurname("Krevnev");
        andrew.setSurname("Kutuzov");

        if (aleksej.age>=18) {
            aleksej.hire();
            System.out.println(aleksej.name + " " + aleksej.getSurname() + " is " + aleksej.age + " years old. You are very experienced and you are hired");
        } else {
            aleksej.fire();
            System.out.println(aleksej.name + " " + aleksej.getSurname() + " is " + aleksej.age + " years old");
        }

        if (andrew.age>=18) {
            andrew.hire();
            System.out.println(andrew.name + " " + andrew.getSurname() + " is " + andrew.age + " years old. You are hired");
        } else {
            andrew.fire();
            System.out.println(andrew.name + " " + andrew.getSurname() + " is " + andrew.age + " years old");
        }

        aleksej.makeOlder();

        System.out.println("Best wishes on your special day " + aleksej.name + " " + aleksej.getSurname()+"!");

        if (aleksej.isHired == true) {
            System.out.println("Hired");
        } else {
            if (aleksej.age<18) {
                System.out.println("You cannot be hired");
            } else {
                System.out.println("You can be hired!");
                aleksej.hire();
            }
        }

        andrew.makeOlder();
        System.out.println("Wishing you a fantastic birthday " + andrew.name + " " + andrew.getSurname());
        if (andrew.isHired == true) {
            System.out.println("Hired");
        } else {
            if (andrew.age<18) {
                System.out.println("You cannot be hired");
            } else {
                System.out.println("You can now get hired!");
                andrew.hire();

            }
        }
    }
}
