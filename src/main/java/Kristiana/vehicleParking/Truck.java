package Kristiana.vehicleParking;

public class Truck extends Car {
    double maxLoad;
    void loadUp() {
        System.out.println("Truck is fully loaded now.");
    }

    Truck(String driver, String numberPlate, double maxLoad) {
        super(driver, numberPlate);
        this.maxLoad = maxLoad;
    }
    @Override
    void checkTechnicalCondition() {
        System.out.println("This truck is in wonderful state!");
    }

    @Override //homework
    public void wash() {
        super.wash();
        System.out.println("Truck are difficult to wash!");}
}
