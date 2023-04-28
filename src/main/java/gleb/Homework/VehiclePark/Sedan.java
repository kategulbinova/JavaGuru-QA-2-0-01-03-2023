package gleb.Homework.VehiclePark;

public class Sedan extends Car {
    int seats;

    @Override
    public void wash() {
        System.out.println("This sedan just used the automatic carwash at the gas station. Sparkling clean!");
    }

    public Sedan(String driver,String numberPlate,int numberOfSeats) {
        super(driver,numberPlate);
        this.seats=numberOfSeats;

    }
}
