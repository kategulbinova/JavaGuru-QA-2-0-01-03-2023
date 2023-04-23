package AlekseiKrevnev.vehiclePark;

public class Vehicle {

    String brand;
    String colour;
    String driver;

    void getDriverInfo() {
        System.out.println("The driver of this vehicle is " + driver);
    }

    void checkTechnicalCondition(){
        System.out.println("This vehicle is in good technical condition. It is safe to use it.");
    }
    Vehicle() {
        this.brand = "Toyota";
        this.colour = "White";
        this.driver = "Grinch";
    }
    Vehicle(String driver) {
        this();
        this.driver = driver;
    }
}
