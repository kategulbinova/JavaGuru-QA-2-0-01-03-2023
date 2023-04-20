package teacher.farm;

public class Cat extends Animal {
    String purr() {
        return "Prrr";
    }

    Cat() {
        super.sound = "Mew";
    }
}
