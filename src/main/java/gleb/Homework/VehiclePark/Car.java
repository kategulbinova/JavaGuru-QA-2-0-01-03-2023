package gleb.Homework.VehiclePark;

public class Car extends Vehicle {
    String numberPlate;

    void wash() {
        System.out.println("Your car is squeaky clean!");
    }
    public Car(String driver,String numberPlate) {
       super(driver);
       this.numberPlate=numberPlate;
    }
}
