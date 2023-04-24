package germans.transports;

public class Vehicle {
    String brand;
    String color;
    String driver;

    void getDriverInfo() {
        System.out.println("This vehicle is driven by: " + driver);
    }

    void checkTechnicalCondition(){
        System.out.println("Vehicle is in great technical condition!");
    }

    Vehicle (){
        this.brand = "Unbranded";
        this.color = "Transparent";
        this.driver = "None";
    }
    Vehicle (String driver) {
        this();
        this.driver = driver;
    }
}