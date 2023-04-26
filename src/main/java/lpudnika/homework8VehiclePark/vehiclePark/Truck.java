package lpudnika.homework8VehiclePark.vehiclePark;

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
        System.out.println("Truck is fully loaded now.");
    }
    @Override
    void checkTechnicalCondition() {
        System.out.println("This truck is in wonderful state!");
    }

    //new method for Truck wash() and method should call parent method and additionally print out text “Truck are really difficult to wash!”
    @Override
    public void wash() {
        super.wash();
        System.out.println("Trucks are really difficult to wash!");
    }

}