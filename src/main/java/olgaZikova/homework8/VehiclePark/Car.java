package olgaZikova.homework8.VehiclePark;

public class Car extends Vehicle {
    String numberPlate;

    public void wash () {

        System.out.println("Your car is now squeaky clean!");
    }

    public Car(String driver, String numberPlate) {
        super(driver);
        this.numberPlate = numberPlate;
    }

    @Override
    void checkTechnicalConditions() {

        System.out.println("Car's oil level is good");
        System.out.println();
    }
}
