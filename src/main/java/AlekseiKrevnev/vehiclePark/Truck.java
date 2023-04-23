package AlekseiKrevnev.vehiclePark;

public class Truck extends Car {

    double maxLoad;
    Truck(String driver, String numberPlate) {
        super(driver, numberPlate);
        this.maxLoad = 0;
    }
    Truck(String driver, String numberPlate, double maxLoad) {
        super(driver, numberPlate);
        this.maxLoad = maxLoad;
    }

    void loadUp() {
        System.out.println("Car is fully loaded now.");
    }
    @Override
    void checkTechnicalCondition() {
        System.out.println("Truck is in great condition");
    }

}
