package NikitaS.CWandHW8AutoparkWash;

public class Vehicle {

    String brand;
    String colour;
    String driver;

    public String getDriverInfo() {
        return ("Vehicle is operated by the driver " + driver);
    }

    public void checkTechnicalCondition() {
        System.out.println("Vehicle is in great technical condition");

    }

    public void wash() {
    }

    Vehicle () {
        this.brand = "";
        this.colour = "";
        this.driver = "";
    }
    Vehicle (String driver) {
        this.brand = "";
        this.colour = "";
        this.driver = driver;
    }

}
