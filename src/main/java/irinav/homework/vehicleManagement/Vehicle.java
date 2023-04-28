package irinav.homework.vehicleManagement;

public class Vehicle {
   String brand;
   String colour;
   String driver;

    void getDriverInfo(){
        System.out.println("This vehicle is operated by the driver:  " + driver);
    }

    void checkTechnicalCondition(){
        System.out.println("This vehicle is in a good technical condition. It is safe to use.");
    }

    Vehicle() {
        this.brand = "";
        this.driver= "";
        this.colour ="";
    }

    Vehicle(String driver, String colour) {
        this();
        this.driver = driver;
    }

    public void wash() {
    }

    public void showNumberOfSeats() {
   }
}
