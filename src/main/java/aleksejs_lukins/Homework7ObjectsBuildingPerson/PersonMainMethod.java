package aleksejs_lukins.Homework7ObjectsBuildingPerson;

public class PersonMainMethod {

    public static void main(String[] args) {

        Person victor = new Person(); //creating optional person
        Person alex = new Person();

        victor.setName("Victor"); //setting only name for optional person
        alex.setNameAndAge("Alex", 32);

        victor.setSurname("Maksimov"); //setting surname for optional person
        alex.setSurname("Lukins");

        if (victor.age > 18) { //optional person "if" statement check
            victor.hire();
        }
        else {
            victor.fire();
        }
        if (alex.age > 18) {
            alex.hire();
        }
        else {
            alex.fire();
        }

        victor.makeOlder(); //making older optional person
        alex.makeOlder();

        System.out.println("Our optional person's name is: " + victor.name); //printing optional persons data
        System.out.println("Our optional person's surname is: " + victor.getSurname()); //printing optional persons data
        System.out.println(victor.name + " is " + victor.age + " years old."); //printing optional persons data
        System.out.println("Our optional person's employment status is: " + victor.isHired); //printing optional persons data

        System.out.println();

        System.out.println("Our person's name is: " + alex.name);
        System.out.println("Our person's surname is: " + alex.getSurname());
        System.out.println(alex.name + " is " + alex.age + " years old.");
        System.out.println("Our person's employment status is: " + alex.isHired);
    }
}
