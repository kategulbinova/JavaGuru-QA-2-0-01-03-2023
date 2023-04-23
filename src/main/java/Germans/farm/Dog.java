package germans.farm;

public class Dog extends Animal {
    String breed;
    Dog() {
        super();
        breed = "Dvorterjer";
        super.sound = "Bark";
    }
    Dog(String breed) {
        super();
        this.breed = breed;
        super.sound = "Bark";
    }
    Dog(String name, String breed) {
        super(name);
        super.age = 7;
        this.breed = breed;
        super.sound = "Bark";
    }
}
