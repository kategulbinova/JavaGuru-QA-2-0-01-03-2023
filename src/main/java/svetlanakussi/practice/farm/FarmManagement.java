package svetlanakussi.practice.farm;

public class FarmManagement {
    public static void main(String[] args) {
        String a;
        Animal myCat = new Animal();
        Animal mySecondCat = new Animal("Timka");
        System.out.println("My first animal: " + myCat.name);
        System.out.println("My second animal: " + mySecondCat.name);

        myCat.sound = "Mew";
        System.out.println("My cat can say: " + myCat.makeSound());

        Cat myThirdCat = new Cat ();
        System.out.println(myThirdCat.purr());
        myThirdCat.goToSleep();
        System.out.println(myThirdCat.makeSound());

        Dog sharik = new Dog();
        Dog zuza = new Dog ("Bublik");

        System.out.println(zuza.makeSound());

        Mouse jerry = new Mouse();
        System.out.println(jerry.makeSound());
    }
}
