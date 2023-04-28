package aleksejs_lukins.PracticeLesson8VehiclePark;

public class Sedan extends Car{
    int seats;

    @Override
    public void wash() {
        System.out.println("This sedan just used the automatic car wash at the gas station. Sparkling clean!");
    }

    Sedan(String driver, String numberPlate, int numberOfSeats){
        super(driver, numberPlate);
        this.seats = numberOfSeats;

    }
}
