package olgaZikova.homework8.VehiclePark;

public class Sedan extends Car {

    int numberOfSeats;

    @Override
    public void wash () {

        System.out.println("This sedan just used the automatic carwash at the gas station");
    }

    Sedan(String driver, String numberPlate, int numberOfSeats) {
        super(driver, numberPlate);
        this.numberOfSeats = numberOfSeats;
    }
    Sedan (String driver, String numberPlate) {
        super(driver, numberPlate);

    }




}
