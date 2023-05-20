package margo.homeWorks.lect8InheritanceVehiclePark;

public class Truck extends Car {
    double maxLoad;

    public void loadUp() {
        System.out.println("Car is fully loaded.");
    }

    Truck(String driver, String numberPlate, double maxLoad) {
        super(driver, numberPlate);
        this.maxLoad = maxLoad;
    }

    @Override
    public void checkTechnicalCondition() {
        System.out.println("Truck's oil level is appropriate. Ready to go!");
    }
    @Override
    public void wash(){
        super.wash();
        System.out.println("But trucks are huge! It's really difficult to wash them.");
    }
}
