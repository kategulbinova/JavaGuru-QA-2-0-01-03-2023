package AlekseiKrevnev.Homeworks.vehiclePark;

public class Truck extends Vehicle {
    public Truck(String make, String model, int year, String driver) {
        super(make, model, year, driver);
    }
    @Override
    public void wash() {
        super.wash();
        System.out.println("Trucks are really difficult to wash!");
    }
}