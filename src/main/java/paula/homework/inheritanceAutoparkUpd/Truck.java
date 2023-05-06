package paula.homework.inheritanceAutoparkUpd;

public class Truck extends Car {
    double maxLoad;

    Truck(String driver, String numebrPlate) {
        super(driver, numebrPlate);
        this.maxLoad = 0;
    }
    Truck(String driver, String numberPlate, double maxLoad) {
        super(driver, numberPlate);
        this.maxLoad = maxLoad;
    }
    void loadUp(){System.out.println("Truck is fully loaded");}
    @Override
    void checkTechnicalCondition(){
        System.out.println("This truck is in wonderful state");
    }
    @Override
    public void wash() {
        super.wash();
        System.out.println("Your car is dirty, you need to clean it!");
    }
}
