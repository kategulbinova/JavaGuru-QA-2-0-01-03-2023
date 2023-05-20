package paula.workInClass.inheritanceAutopark;

import org.checkerframework.checker.units.qual.C;

public class MainProgram {

    public static void main(String[] args) {
        Vehicle yellowBus = new Vehicle("Sergejs");
        Vehicle myBike = new Vehicle("Paula Cvikova");
        yellowBus.getDriverInfo();
        myBike.getDriverInfo();

        Car toyota = new Car("Artjoms", "LT1010");

        Truck mercedes = new Truck("Gatis", "FZ878", 1200.1);
        mercedes.getDriverInfo();
        mercedes.loadUp();
        mercedes.wash();

        Sedan myCar = new Sedan("Natalija", "HC333", 7);
        myCar.getDriverInfo();
        myCar.wash();

        Bicycle myBicycle = new Bicycle("John", 6);
        myBicycle.getDriverInfo();
        myBicycle.fold();

        Vehicle scooter = new Vehicle();
        Car audi = new Car("Laura", "ZZ789");

        scooter.checkTechnicalCondition();
        audi.checkTechnicalCondition();

        Truck myTruck = new Truck("Vova", "KZ9632", 3456.2);
        myTruck.checkTechnicalCondition();


    }
}
