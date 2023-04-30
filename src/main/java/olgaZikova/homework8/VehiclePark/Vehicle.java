package olgaZikova.homework8.VehiclePark;

public class Vehicle {
    String brand;
    String colour;
    String driver;

    public void getDriverinfo () {

        System.out.println("Vehicle is operated by driver " + driver + ".");
        System.out.println();
    }
        void checkTechnicalConditions () {

        System.out.println("Vehicle is in great technical condition!");
    }

    Vehicle() {
        this.brand = "";
        this.colour = "";
        this.driver = "no name";
    }

    public Vehicle(String driver) {
        this ();
        this.driver = driver;
    }


}
