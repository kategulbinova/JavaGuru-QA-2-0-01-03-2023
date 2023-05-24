package margo.homeWorks.lect8InheritanceVehiclePark;

public class Vehicle {
    String brand;
    String colour;
    String driver;
    Vehicle(){}
    Vehicle(String driver) {
        this.driver = driver;
    }
    public void getDriverInfo() {
        System.out.println("The vehicle is driven by: " + this.driver);
    }
    public void checkTechnicalCondition() {
        System.out.println("This vehicle is in good technical condition!");
    }
    public void wash() {
        System.out.println("W A S H E D");
    }
}
