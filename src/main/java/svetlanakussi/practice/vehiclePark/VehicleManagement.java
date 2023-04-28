package svetlanakussi.practice.vehiclePark;

import svetlanakussi.practice.farm.Animal;

public class VehicleManagement {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        Vehicle myDadCar = new Vehicle();
        System.out.println("My car: " + myCar.brand + " in " + myCar.colour +" colour.");
        System.out.println("My Dad car: " + myDadCar.brand);
    }
}
