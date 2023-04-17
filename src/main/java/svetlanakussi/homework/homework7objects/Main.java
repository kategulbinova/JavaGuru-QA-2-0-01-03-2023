package svetlanakussi.homework.homework7objects;

public class Main {
    public static void main(String[] args) {
        Person alise = new Person("Alise");
        alise.setSurname ("Popova");
        if (alise.age > 18) {
            alise.hire();
        }
        else{
            alise.fire();
        }
        System.out.println(alise.name + " " + alise.getSurname() + " is " + alise.age + " years old and is " + (alise.isHired ? "hired" : "not hired"));

        Person aldis = new Person("Aldis", 2005);
        aldis.setSurname("Mikelsons");
        if (aldis.age > 18) {
            aldis.hire();
        }
        else{
            aldis.fire();
        }
        System.out.println(aldis.name + " " + aldis.getSurname() + " is " + aldis.age + " years old and is " + (aldis.isHired ? "hired" : "not hired"));

       alise.makeOlder();
       aldis.makeOlder();
        System.out.println("The new year has come, the birthdays of the candidates have passed, now the status is the following:");
        System.out.println(alise.name + " " + alise.getSurname() + " is now " + alise.age + " years old and is " + (alise.isHired ? "hired" : "not hired"));
        System.out.println(aldis.name + " " + aldis.getSurname() + " is now " + aldis.age + " years old and is " + (aldis.isHired ? "hired" : "not hired"));
    }
}


