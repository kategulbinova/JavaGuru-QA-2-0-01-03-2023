package marijaplumite.classworks.vehiclePark;

public class Vehicle {
    String brand;
    String colour;
    String driver;
    void getDriverInfo(){
        System.out.println("Vehicle is operated by the driver " + driver);
    }
    void checkTechnicalCondition(){
        System.out.println("This vehicle is in good technical condition. It is safe to use it.");
    }
    Vehicle(){
        this.driver = "no name";
        this.colour="";
        this.brand="";
    }
    Vehicle(String driver){
        this.driver = driver;
        this.colour="";
        this.brand="";

    }
}
