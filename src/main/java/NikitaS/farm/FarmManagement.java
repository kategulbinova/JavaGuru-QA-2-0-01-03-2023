package NikitaS.farm;

public class FarmManagement {
    public static void main(String[] args) {
        String a = "Test";
        Animal myCat = new Animal();
        Animal mySecondCat = new Animal("Murka");

        System.out.println("My first animal: " + myCat.name);
        System.out.println("My second animal: " + mySecondCat.name);

        myCat.sound = "Mew";
        myCat.goToSleep();
        System.out.println("My cat can say: " + myCat.makeSound());

    }
}
