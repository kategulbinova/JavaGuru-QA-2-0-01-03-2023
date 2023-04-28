package teacher.autoPark;

public class Car extends Vehicle {
    String numberPlate;
    void wash() {
        System.out.println("Your car is now squeaky clean!");
    }

    @Override
    void checkTechnicalCondition() {
        System.out.println("Car's oil level is good. Headlights are leveled appropriately.");
    }
    Car(String driver, String numberPlate) {
        super(driver);
        this.numberPlate = numberPlate;
    }
}
