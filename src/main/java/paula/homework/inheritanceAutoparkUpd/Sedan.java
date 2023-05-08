package paula.homework.inheritanceAutoparkUpd;

public class Sedan extends Car {
    int seats;
    Sedan(String driver, String numberPlate) {
        super(driver, numberPlate);
    }
    Sedan(String driver, String numberPlate, int numberOfSeats) {
        super(driver, numberPlate);
        this.seats = numberOfSeats;
    }
    @Override
    public void wash() {
        System.out.println("Go to wash station, clean your car");
    }
}
