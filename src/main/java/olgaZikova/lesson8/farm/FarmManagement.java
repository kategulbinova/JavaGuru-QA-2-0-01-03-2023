package olgaZikova.lesson8.farm;

public class FarmManagement {
    public static void main(String[] args) {
        String a;
        Animal myCat1 = new Animal();
        Animal myCat2 = new Animal("Boris");
        Animal myCat3 = new Animal("Masha");

        System.out.println("My first animal: " + myCat1.name);
        System.out.println("My second animal: " + myCat2.name);
        System.out.println("My second animal: " + myCat3.name);

        myCat1.goToSleep();
        myCat1.sound = "mju";

        System.out.println("My cat can say:" + myCat1.makeSound());

        Cat myCat4 = new Cat();
        System.out.println(myCat4.purr());

        myCat3.goToSleep();
        System.out.println(myCat4.makeSound());

        Dog sharik = new Dog();
        Dog lord = new Dog("German shepard");
        Dog tuzik = new Dog("Tuzik", "German sgepard");

        System.out.println(tuzik.makeSound());

        Mouse jerry = new Mouse();

        System.out.println(jerry.makeSound());
    }
}