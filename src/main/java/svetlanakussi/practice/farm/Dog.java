package svetlanakussi.practice.farm;

public class Dog extends Animal {
    String breed;

    Dog() {
        super();
        breed = "Dvorterjer";
    }

    Dog(String breed) {
        super();
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super();
        super.age = 7;
        this.breed = breed;
    }
}

