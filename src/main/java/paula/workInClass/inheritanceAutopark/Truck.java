package paula.workInClass.inheritanceAutopark;

public class Truck extends Car{
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
}
