package lpudnika.lessons.lesson8.animalManaging;

public class AnimalsOnFarm {

    public static void main(String[] args) {

        Animals myCat = new Animals("Max");
        Animals mySecondCat = new Animals("Kostja");

        myCat.sound = "Mee";
        mySecondCat.goToSleep();

        System.out.println("My first cat is: " + myCat.name);
        System.out.println("My second animal: " + mySecondCat.name);
        System.out.println("My cat can say: " + myCat.makeSound());
    }
}
