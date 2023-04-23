package AlekseiKrevnev.vehiclePark;

public class Car extends Vehicle {
    String numberPlate;
    void wash() {
        System.out.println("Your car is now clean.");
    }

    @Override
    void checkTechnicalCondition() {
        System.out.println("Oil level is enough. Headlights are corrected according to the rules.");
    }
    Car(String driver, String numberPlate) {
        super(driver);
        this.numberPlate = numberPlate;
    }
}
