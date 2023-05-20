package margo.classWork.lect8ObjectsFarm;

public class Dog extends Animal {
    String breed;
    Dog() {
        super();
        breed = "Toy-terrier";
        super.sound = "Bark";
    }
    Dog(String breed) {
        super();
        this.breed = breed;
        super.sound = "Bark";
    }
    Dog(String name, String breed) {
        super(name);
        super.age = 11;
        this.breed = breed;
        super.sound = "Bark";
    }
}
