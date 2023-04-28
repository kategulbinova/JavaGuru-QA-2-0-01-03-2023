package natuksa.Farm;

public class Cat extends Animal{
    String purr() {
        return "Purr";
    }
    Cat() {
        super.sound = "mew";
    }
}
