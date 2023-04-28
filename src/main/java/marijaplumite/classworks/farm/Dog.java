package marijaplumite.classworks.farm;

public class Dog extends Animal {
    String breed;
    Dog() {
        super();
        breed = "Dober";
        super.sound = "Woof";
    }
    Dog(String breed){
        super();
        this.breed = breed;
        super.sound = "Woof";
    }
    Dog(String name, String breed){
        super.name = name;
        super.age = 7;
        this.breed = breed;
        super.sound = "Woof";
    }
}
