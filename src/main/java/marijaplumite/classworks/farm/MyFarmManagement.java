package marijaplumite.classworks.farm;

public class MyFarmManagement {
    public static void main(String[] args) {
        Animal cow = new Animal();
        Animal cat = new Animal("Tima");

        System.out.println("My livestock: " + cow.name);
        System.out.println("My home pet: " + cat.name);

        cow.sound = "Muu";
        cow.goToSleep();
        System.out.println("My cow can say: " + cow.makeSound());

        Cat thirdAnimal = new Cat();

        System.out.println(thirdAnimal.purr());
        thirdAnimal.goToSleep();
        System.out.println(thirdAnimal.makeSound());


        Dog sharik = new Dog();
        Dog laki = new Dog("Pudel");
        Dog karat = new Dog ("Karat", "Dober");

        System.out.println(karat.makeSound());

        Mouse jerry = new Mouse();

        System.out.println(jerry.makeSound());
    }
}
