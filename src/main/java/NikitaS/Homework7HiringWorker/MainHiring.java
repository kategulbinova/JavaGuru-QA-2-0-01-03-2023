package NikitaS.Homework7HiringWorker;

public class MainHiring {
    public static void main(String[] args) {
        Person nick = new Person("Nick", 2006);
        Person john = new Person("John");
        nick.setSurname("Jackson");
        john.setSurname("Wick");
        if (nick.age>=18) {
            nick.hire();
            System.out.println(nick.name + " " + nick.getSurname() + " is " + nick.age + " years old which is sufficient and gets hired");
        } else {
            nick.fire();
            System.out.println(nick.name + " " + nick.getSurname() + " is " + nick.age + " years old which is insufficient and doesn't get hired");
        }
        if (john.age>=18) {
            john.hire();
            System.out.println(john.name + " " + john.getSurname() + " is " + john.age + " years old which is sufficient and gets hired");
        } else {
            john.fire();
            System.out.println(john.name + " " + john.getSurname() + " is " + john.age + " years old which is insufficient and doesn't get hired");
        }
        nick.makeOlder();
        System.out.println("Happy Birthday " + nick.name + " " + nick.getSurname() + "! You are now " + nick.age + " year(s) old!" );
        if (nick.isHired == true) {
            System.out.println("You are already hired");
        } else {
            if (nick.age<18) {
                System.out.println("But you are still less than 18 so can't get hired");
            } else {
                System.out.println("You can now get hired!");
                nick.hire();

            }
        }
        john.makeOlder();
        System.out.println("Happy Birthday " + john.name + " " + john.getSurname() + "! You are now " + john.age + " year(s) old!" );
        if (john.isHired == true) {
            System.out.println("You are already hired");
        } else {
            if (john.age<18) {
                System.out.println("But you are still less than 18 so can't get hired");
            } else {
                System.out.println("You can now get hired!");
                john.hire();

            }
        }
    }
}
