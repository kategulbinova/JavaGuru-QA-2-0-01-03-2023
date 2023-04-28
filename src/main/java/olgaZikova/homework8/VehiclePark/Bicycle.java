package olgaZikova.homework8.VehiclePark;

public class Bicycle extends Vehicle {
    boolean isFolded;
    int numberOfSpeeds;

    public void fold () {
        if (isFolded = true) {
            System.out.println("Your bicycle is folded");
        }
    }

    public Bicycle(String driver, int numberOfSpeeds) {
        super(driver);
        this.isFolded = false;
        this.numberOfSpeeds = numberOfSpeeds;
    }
}
