package germans.transports;

public class Truck extends Car{

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
    @Override
    void wash(){
        super.wash();
        System.out.println("Truck are really difficult to wash!");
    }

}