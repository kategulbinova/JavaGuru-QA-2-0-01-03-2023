package NikitaS.CWandHW8AutoparkWash;

public class Car extends Vehicle{
    String numberPlate;
    @Override
    public void wash() {
        System.out.println("Your car is now squeaky clean!");
    }
    @Override
    public void checkTechnicalCondition() {
        System.out.println("Car's oil level is good. Headlights are leveled appropriately");
    }
    Car(String driver, String numberPlate) {
        super(driver);
        this.numberPlate = numberPlate;
    }
}
