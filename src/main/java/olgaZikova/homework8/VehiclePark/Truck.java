package olgaZikova.homework8.VehiclePark;

public class Truck extends Car {
    double maxLoad;

    Truck(String driver, String numberPlate) {
        super(driver, numberPlate);
        this.maxLoad = 0;

    }
    Truck(String driver, String numberPlate, double maxLoad) {
        super(driver, numberPlate);
        this.maxLoad = maxLoad;

    }
    void loadUp () {

        System.out.println("Car is fully loaded");
    }

    @Override
    void checkTechnicalConditions () {
        System.out.println("This truck is in wonderful state!");

    }

    @Override
    public void wash () {
        super.wash ();
        System.out.println("Trucks are really difficult to wash");
    }
}
