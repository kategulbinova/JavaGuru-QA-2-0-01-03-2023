package lpudnika.homework8VehiclePark.vehiclePark;

public class Vehicle {
    String brand;
    String colour;
    String driver;
    String numberPlate;

    void getDriverInfo() {
        System.out.println("This vehicle is driven by: " + driver);
    }

    void checkTechnicalCondition(){
        System.out.println("Vehicle is in great technical condition!");
    }
    Vehicle() {
        this.brand = "Unbranded";
        this.colour = "Transparent";
        this.driver = "None";
    }
    Vehicle(String driver) {
        this();
        this.driver = driver;
    }

    public void wash() {
        System.out.println("Vehicle does not need to be washed!");
    }

    public void getNumberPlate() {
        System.out.println("Number plate of the vehicle is " + numberPlate + "!");
    }
}