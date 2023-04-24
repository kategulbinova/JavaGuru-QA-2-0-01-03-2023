package AlekseiKrevnev.Homeworks.vehiclePark;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String driver;

    public Vehicle(String make, String model, int year, String driver) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.driver = driver;
    }

    public Vehicle(String driver) {
    }

    public void getDriverInfo() {
        System.out.println("Driver of " + make + " " + model + " is " + driver);
    }

    public void wash() {
        System.out.println("Washing " + make + " " + model + "...");
    }
}