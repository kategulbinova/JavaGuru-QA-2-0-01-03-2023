package margo.classWork.lect8ObjectsFarm;

public class FarmManagement {
    public static void main(String[] args) {
        Animal myCat = new Animal();
        Animal myDog = new Animal("Jagger");

        System.out.println("My first animal is: " + myCat.name);
        System.out.println("My second animal is: " + myDog.name);
        System.out.println();

        myCat.sound = "Meow";
        myCat.goToSleep();
        System.out.println("My cat says: " + myCat.makeSound());
        System.out.println();

        Cat myRealCat = new Cat();
        System.out.println(myRealCat.purr());
        myRealCat.goToSleep();
        myRealCat.makeSound();
        System.out.println("My real cat says: " + myRealCat.makeSound());
        System.out.println();

        Dog angry = new Dog();
        Dog little = new Dog("Chihuahua");
        Dog random = new Dog("Neo","York terrier");
        System.out.println(angry.makeSound());
        System.out.println();

        Mouse jerry = new Mouse();
        System.out.println(jerry.makeSound());

    }
}
