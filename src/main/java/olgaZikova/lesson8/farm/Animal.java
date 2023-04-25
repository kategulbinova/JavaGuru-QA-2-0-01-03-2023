package olgaZikova.lesson8.farm;

public class Animal {
    String name;
    String sound;
    int age;
    double weight;
    boolean isAwake;

    String makeSound () {
        if (isAwake) {
            return this.sound + "-" + this.sound;
        } else
            return "Hrrr";
    }
    void eat (double amount) {
        this.weight = weight + (amount/10);
    }

    void goToSleep () {
        this.isAwake = false;
    }

    void wakeUP () {
        this.isAwake = true;
    }

    public Animal() {
        this.name = "no name";
        isAwake = true;
        this.age = 0;
        this.weight = 0;
    }

    public Animal(String name) {
        this.name = name;
        isAwake = true;
        this.age = 0;
        this.weight = 0;
    }


}

