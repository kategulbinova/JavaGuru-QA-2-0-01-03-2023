package AlekseiKrevnev.Homeworks.vehiclePark;

public class Sedan extends Vehicle {
    public Sedan(String make, String model, int year, String driver) {
        super(make, model, year, driver);
    }

    @Override
    public void wash() {
        System.out.println("This sedan just used the automatic carwash at the gas station. Sparkling clean!");
    }
}
