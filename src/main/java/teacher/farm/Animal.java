package teacher.farm;

public class Animal {
    public String name;
    public String sound;
    int age;
    double weight;
    boolean isAwake;


    public Animal() {
        this.name = "No name";
        this.isAwake = true;
        this.age = 0;
        this.weight = 0;
    }

    Animal(String name,
           String sound,
           int age,
           double weight,
           boolean isAwake) {
        this.name = name;
        this.sound = sound;
        this.age = age;
        this.weight = weight;
        this.isAwake = isAwake;
    }

    public Animal(String name) {
        this.name = name;
        this.isAwake = true;
        this.age = 0;
        this.weight = 0;
    }

/*
    Animal(String name, Boolean isAwake) {
        this.name = name;
        this.isAwake = isAwake;
        this.age = 0;
        this.weight = 0;
    }
*/


    public String makeSound() {
        if (isAwake) {
            return this.sound + "-" + this.sound;
        } else {
            return "Hrrrrr";
        }
    }
    void eat(double amount) {
        this.weight = this.weight + (amount / 10);
    }
    public void goToSleep() {
        this.isAwake = false;
    }

    void wakeUp() {
        this.isAwake = true;
    }

}
