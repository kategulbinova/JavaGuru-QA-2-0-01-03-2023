package NikitaS.CWandHW8AutoparkWash;

public class Truck extends Car {
    int maxLoad;

    public void loadUp() {
        System.out.println("Car is fully loaded");
    }

    Truck(String driver, String numberPlate, int maxLoad) {
        super(driver, numberPlate);
        this.maxLoad = maxLoad;
    }
    @Override
    public void wash() {
        super.wash();
        System.out.println("Truck are really difficult to wash!");
    }

}
