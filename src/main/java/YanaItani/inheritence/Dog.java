package YanaItani.inheritence;

public class Dog extends Animal{
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
    Dog (String name, String breed) {
        super(name);
        this.breed = breed;
        super.sound = "Bark";
    }
}
