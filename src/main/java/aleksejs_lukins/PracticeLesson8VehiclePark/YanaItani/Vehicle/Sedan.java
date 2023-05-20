package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani.Vehicle;

public class Sedan extends Car {
    int seats;
    Sedan (String driver, String plateNumber, int numberOfSeats){
        super(plateNumber, driver);
        this.seats = numberOfSeats;
    }
    void wash() {
       System.out.println("This sedan has just used automatic carwash at the gas station. Sparkling clean!");
    }

}
