package gleb.Homework.VehiclePark;

public class Truck extends Car {
    double maxLoad;
    void loadUp() {
        System.out.println("Car is fully loaded");
    }
    @Override
    public void wash() {
        super.wash();
        System.out.println("Trucks are really difficult to wash!");
    }
    @Override
    void checkTechnicalCondition(){
        System.out.println("This truck is in wonderful state!");
    }
    public Truck(String driver,String numberPlate,double maxLoad) {
        super(driver,numberPlate);
        this.maxLoad=maxLoad;

    }
}
