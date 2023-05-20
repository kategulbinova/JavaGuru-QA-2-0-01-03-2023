package lpudnika.homework8VehiclePark.vehiclePark;

public class Sedan extends Car {

    int seats;
    Sedan(String driver, String numberPlate) {
        super(driver, numberPlate);
    }
    Sedan(String driver, String numberPlate, int numberOfSeats) {
        super(driver, numberPlate);
        this.seats = numberOfSeats;
    }

    //new method for Sedan wash() and method should only print out text "This sedan just used the automatic carwash at the gas station. Sparkling clean!".
    @Override
    public void wash() {
        System.out.println("This sedan just used the automatic carwash at the gas station. Sparkling clean!");
    }

}
