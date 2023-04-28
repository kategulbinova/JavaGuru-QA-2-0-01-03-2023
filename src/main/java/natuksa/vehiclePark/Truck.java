package natuksa.vehiclePark;

public class Truck extends Car {
    double maxLoad;
    public void loadUp() {
        System.out.println("Car is fully loaded");
    }
    Truck(String driver, String numberPlate, double maxLoad) {
        super(driver, numberPlate);
        this.maxLoad = maxLoad;
    }
    @Override
    public void checkTechnicalCondition() {
        System.out.println("Truck is safe.");
    }
    @Override
    public void wash() {
        super.wash();
        System.out.println("Truck are really difficult to wash!");
    }
}
