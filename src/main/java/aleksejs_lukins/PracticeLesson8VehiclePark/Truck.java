package aleksejs_lukins.PracticeLesson8VehiclePark;

public class Truck extends Car {

    int maxLoad;

    public void loadUp(){
        System.out.println("Car is fully loaded");
    }

    Truck(String driver, String numberPlate, int maxLoad) {
        super(driver, numberPlate);
        this.maxLoad = maxLoad;
    }
}
