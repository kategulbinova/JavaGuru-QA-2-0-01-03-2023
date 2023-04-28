package gleb.Homework.VehiclePark;

public class Vehicle {
    String brand;
    String colour;
    String driver;
    void getDriverInfo() {
       System.out.println("Vehicle operated by "+driver);
    }
    Vehicle() {
        String driver="";
        }
}
