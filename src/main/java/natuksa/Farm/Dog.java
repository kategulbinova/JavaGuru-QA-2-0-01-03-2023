package natuksa.Farm;

public class Dog extends Animal{
    String breed;
    Dog() {
        super();
        breed = "Terjer";
    }
    Dog(String breed) {
        super();
        this.breed = breed;
    }
    Dog(String name, String breed) {
        super(name);
        super.age = 7;
        super.sound = "Bark";

    }
}
