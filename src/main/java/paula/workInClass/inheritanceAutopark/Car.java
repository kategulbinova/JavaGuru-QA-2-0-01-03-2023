package paula.workInClass.inheritanceAutopark;

public class Car extends Vehicle {
    String numberPlate;
    void wash() {System.out.println("Your car is squeaky clean");}
    @Override
    void checkTechnicalCondition(){
        System.out.println("Car's oil level is good. Headlights are leveled appropriately");
    }
    Car(String driver, String numebrPlate){
        super(driver);
        this.numberPlate = numebrPlate;
    }
}
