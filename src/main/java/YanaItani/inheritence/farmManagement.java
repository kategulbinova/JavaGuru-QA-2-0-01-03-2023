package YanaItani.inheritence;

public class farmManagement {
    public static void main(String[] args) {
        String a;
        Animal myCat = new Animal();
        Animal mySecondCat = new Animal("Oreo");
        System.out.println("My first animal is " + myCat.name);
        System.out.println("My first animal is " + mySecondCat.name);
        myCat.sound = "Mew";
        myCat.goToSleep();
        System.out.println("My cat can  " + myCat.makeSound());
        Cat myThirdCat = new Cat();
        System.out.println(myThirdCat.purr());
        myThirdCat.goToSleep();

        Dog sky = new Dog();
        Dog grass = new Dog ("German shaper");
        Dog cloud = new Dog("lou", "German shaper");


    }
}
