package paula.homework.inheritanceAutoparkUpd;

public class Vehicle {
    String brand;
    String color;
    String driver;
    void getDriverInfo() {System.out.println("This vehicle is driven by: " + driver);}

    void checkTechnicalCondition() {System.out.println("Vehicle is in great condition");}

    Vehicle(){
        this.brand = "Unbranded";
        this.color = "Transparent";
        this.driver = "None";
    }
    protected Vehicle(String driver) {
        this();
        this.driver = driver;
    }
}
