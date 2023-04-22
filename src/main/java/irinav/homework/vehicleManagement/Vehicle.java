package irinav.homework.vehicleManagement;

public class Vehicle {
   String brand;
   String colour;
   String driver;


    void getDriverInfo(){
        System.out.println("This vehicle is operated by the driver:  " + this.driver);
    }

    void checkTechnicalCondition(){
        System.out.println("This vehicle is in a good technical condition. It is safe to use.");
    }

    Vehicle() {
     this.brand = "";
     this.driver= "";
     this.colour ="";
    }

    Vehicle(String driver) {
        this();
        this.driver = driver;
    }

    public void wash() {
    }
}
