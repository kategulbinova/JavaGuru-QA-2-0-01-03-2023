package margo.classWork.lect8ObjectsFarm;

public class Cat extends Animal{
    String purr() {
        return "Prr..";
    }
    Cat() {
        super.sound = "Meow";
    }
}
