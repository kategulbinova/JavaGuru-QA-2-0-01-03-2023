package Kristiana.vehicleParking;

public class Car extends Vehicle {
    String numberPlate;
    void wash() {
        System.out.println("Your car is now squeaky clean!");
    }
    @Override
    void checkTechnicalCondition() {
        System.out.println("Car's oil level is appropriate, and the headlights are leveled correctly.");
    }
    Car(String driver, String numberPlate) {
        super(driver);
        this.numberPlate = numberPlate;
    }
}
