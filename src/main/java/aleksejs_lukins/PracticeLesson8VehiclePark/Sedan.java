package aleksejs_lukins.PracticeLesson8VehiclePark;

public class Sedan extends Car{
    int seats;
    Sedan(String driver, String numberPlate, int numberOfSeats){
        super(driver, numberPlate);
        this.seats = numberOfSeats;

    }
}
