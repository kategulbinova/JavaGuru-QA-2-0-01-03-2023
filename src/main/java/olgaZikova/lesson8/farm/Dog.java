package olgaZikova.lesson8.farm;

public class Dog extends Animal {
    String breed;
    Dog () {
        super ();
        breed = "boxer";
        super.sound = "bark";
    }
    Dog (String breed) {
        super();
        this.breed = breed;
        super.sound = "bark";
    }
    Dog (String name, String breed) {
        super(name);
        super.age = 7;
        this.breed = breed;
        super.sound = "bark";
    }


}
