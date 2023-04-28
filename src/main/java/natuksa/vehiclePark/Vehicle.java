package natuksa.vehiclePark;

public class Vehicle {
    String cars;
    String colour;
    String driver;
    public void getDriverInfo() {
        System.out.println("Vehicle is operated by the driver " + driver + ".");
    }
    Vehicle() {
        this.driver = "";
    }
    Vehicle(String driver) {
        this.driver = driver;
    }
    public void checkTechnicalCondition() {
        System.out.println("This vehicle is good!");
    }
}
