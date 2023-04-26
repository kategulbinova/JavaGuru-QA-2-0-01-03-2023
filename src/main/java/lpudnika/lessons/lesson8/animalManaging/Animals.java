package lpudnika.lessons.lesson8.animalManaging;

public class Animals {

    String name;

    int age;

    String sound;

    double weight;

    boolean isAwake;

    String makeSound() {
        if (isAwake) {
            return this.sound + "-" + this.sound;
        } else {
            return "rrrrrrr";
        }
    }

    void eat(double amount) {
        this.weight = this.weight + (amount/10);
    }

    void goToSleep() {
        this.isAwake = false;
    }

    Animals (String name) {
        this.name = name;
        this.isAwake = true;
        this.age = 0;
        this.weight = 0;
    }
}
