package YanaItani.Vehicle;

public class Truck extends Car {
    int maxLoad;

    void loadUp() {
        System.out.println("Car is fully loaded");
    }

    Truck(String plateNumber, String driver, int maxLoad) {
        super(plateNumber, driver);
        this.maxLoad = maxLoad;
    }

    void wash() {
        super.wash();
        System.out.println("Trucks are really difficult to wash");

    }
}
