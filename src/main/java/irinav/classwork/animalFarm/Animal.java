package irinav.classwork.animalFarm;

 public class Animal {
     String name;
     String sound;
     int age;
     double weight;
     boolean isAwake;

     String makeSound() {
         if (isAwake) {
             return this.sound + "-" + sound;
         } else {
             return "Hrrr ";
         }
     }

         void eat ( double amount) {
             this.weight = weight + (amount / 10);
         }

             void goToSleep () {
                 this.isAwake = false;
             }
             void wakeUp () {
                 this.isAwake = true;
             }
             Animal() {
                 this.name = "no name";
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




