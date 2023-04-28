package gleb.lesson8;

public class AnimalDadMom {
    public class Animal {
        String name;
        String sound;
        int age;
        double weight;
        boolean isAwake;
        String makeSound() {
            if (isAwake) {
                return this.sound + "-" + this.sound;
            } else {
                return "Hrrrrr";
            }
        }
        void eat(double amount) {
            this.weight = this.weight + (amount / 10);
        }
        void goToSleep() {
            this.isAwake = false;
        }

        void wakeUp() {
            this.isAwake = true;
        }

        Animal() {
            this.name = "No name";
            this.isAwake = true;
            this.age = 0;
            this.weight = 0;
        }
        Animal(String name) {
            this.name = name;
            this.isAwake = true;
            this.age = 0;
            this.weight = 0;
        }
    }

}
