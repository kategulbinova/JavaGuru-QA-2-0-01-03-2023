package margo.homeWorks.lect8InheritanceVehiclePark;

public class Sedan extends Car {
    int seats;
    Sedan(String driver, String numberPlate, int numberOfSeats) {
        super(driver, numberPlate);
        this.seats = numberOfSeats;
    }
    @Override
    public void wash() {
        System.out.println("This sedan just used the auto-carwash at the gas station. Sparkling clean!");
    }
}
