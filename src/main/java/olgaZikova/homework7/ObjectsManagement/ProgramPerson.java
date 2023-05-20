package olgaZikova.homework7.ObjectsManagement;

public class ProgramPerson {
    public static void main(String[] args) {

        Person myPerson1 = new Person("Olga", 65);
        myPerson1.setSurname("Zikova");
        myPerson1.getOlder();
        myPerson1.getHired();
        myPerson1.getFired();


        Person myPerson2 = new Person("Elon", 51);
        myPerson2.setSurname("Musk");
        myPerson2.getOlder();
        myPerson2.getHired();
        myPerson2.getFired();

        Person myPerson3 = new Person("Jhon");
        myPerson3.setSurname("Brown");
        myPerson3.getOlder();
        myPerson3.getHired();
        myPerson3.getFired();





    }
}
