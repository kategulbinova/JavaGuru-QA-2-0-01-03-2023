package natuksa.vehiclePark;

public class Car extends Vehicle {
    String numberPlate;
    public void wash() {
        System.out.println("Your car is now squeaky clean!");
    }
    Car(String driver, String numberPlate) {
        super(driver);
        this.numberPlate = numberPlate;
    }

    @Override
    public void checkTechnicalCondition() {
        super.checkTechnicalCondition();
        System.out.println("Drive safely.");
    }
}
