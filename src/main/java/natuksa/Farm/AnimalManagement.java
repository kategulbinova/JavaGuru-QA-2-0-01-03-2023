package natuksa.Farm;

public class AnimalManagement {
    public static void main(String[] args) {
        String a = "Test";
        Animal myCat = new Animal();
        Animal mySecondCat = new Animal("Murka");

        System.out.println("My first animal: " + myCat.name);
        System.out.println("My second animal: " + mySecondCat.name);

        myCat.sound = "Mew";
        myCat.goToSleep();
        System.out.println("My cat can say: " + myCat.makeSound());

        Cat myThirdCat = new Cat();
        Dog sharik = new Dog();
        Dog ceaser = new Dog("Shepard");
        Dog tuzik = new Dog("Tuz", "Shepard");
        System.out.println(tuzik.makeSound());

        Mouse jerry = new Mouse();
        System.out.println(jerry.makeSound());

    }
}
