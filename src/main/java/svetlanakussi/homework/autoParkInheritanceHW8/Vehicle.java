package svetlanakussi.homework.autoParkInheritanceHW8;

public class Vehicle {
    String brand;
    String color;
    String driver;
    String numberPlate;

    public Vehicle(String brand, String color, String driver, String numberPlate) {
        this.brand = brand;
        this.color = color;
        this.driver = driver;
        this.numberPlate = numberPlate;
    }

    public void getDriverInfo() {
        System.out.println("Owner of " + color + " " + brand + " with number plate " + numberPlate + " is " + driver +".");
    }

    public void wash() {
        System.out.println( brand + " with number plate: " + numberPlate + " in the process of washing.");
    }
}