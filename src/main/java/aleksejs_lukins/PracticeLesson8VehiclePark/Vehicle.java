package aleksejs_lukins.PracticeLesson8VehiclePark;

public class Vehicle {
    String brand;
    String colour;
    String driver;

    public void getDriverInfo(){
        System.out.println("Our driver is: " + driver);
    }

    Vehicle(){
        this.driver = "No drivers name";
    }

    Vehicle(String driver){
        this.driver = driver;
    }

    public void checkTechnicalCondition(){
        System.out.println("Good technical condition. It is safe to use it.");
    }

}
