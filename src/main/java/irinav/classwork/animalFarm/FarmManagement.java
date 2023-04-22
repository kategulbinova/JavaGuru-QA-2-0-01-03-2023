package irinav.classwork.animalFarm;

public class FarmManagement {
    public static void main(String[] args) {
        String a = "Test";
        Animal myCat = new Animal();
        Animal mySecondCat = new Animal("Murka");

        System.out.println("My first animal: " + myCat.name);
        System.out.println("My second animal: " + mySecondCat.name);

        myCat.sound = "Mew";
        System.out.println("My cat can say: " + myCat.sound);

        myCat.goToSleep();
        System.out.println("My cat can say: " + myCat.makeSound());

        Cat myThirdCat = new Cat();
        System.out.println(myThirdCat.purr());
        myThirdCat.makeSound();

        System.out.println(myThirdCat.makeSound());
        System.out.println(myThirdCat.purr());
        myThirdCat.goToSleep();
        System.out.println(myThirdCat.makeSound());

        Dog sharik = new Dog();
        Dog ceasar = new Dog("German shepard");
        Dog tuzik = new Dog("Tuz", "German shepard");

        System.out.println(tuzik.makeSound());

        Mouse jerry = new Mouse();

        System.out.println(jerry.makeSound());

    }
}
