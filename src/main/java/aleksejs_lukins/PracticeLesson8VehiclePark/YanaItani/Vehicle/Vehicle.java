package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani.Vehicle;

public class Vehicle {
    String brand;
    String colour;
    String driver;

     Vehicle() {
        this.driver = "";

    }
    void getDriverInfo() {
        System.out.println("Vehicle is operated by the driver " + driver);

    }

     Vehicle(String driver){
        this.driver = driver;
    }
    void checkTechnicalCondition () {
         System.out.println("This vehicle is in good technical condition. It is safe to use it.");
    }

}