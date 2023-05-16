package margo.homeWorks.lect8InheritanceVehiclePark;

public class VehicleParkManagement {
    public static void main(String[] args) {
        /*Vehicle bus = new Vehicle();
        bus.driver = "Alfredo";
        bus.getDriverInfo();

        System.out.println();

        Vehicle motorbike = new Vehicle("Mario");
        motorbike.getDriverInfo();

        System.out.println();

        Car car = new Car("Santiago", "MI-8888");
        car.getDriverInfo();

        System.out.println();

        Truck truck = new Truck("Hoolio", "LV-0000", 1000);
        truck.getDriverInfo();
        truck.loadUp();

        System.out.println();

        Sedan sedan = new Sedan("Carlos", "LV-1111", 5);
        System.out.println("The driver of the car " + sedan.numberPlate + " is " + sedan.driver + " who can transport 4 people as this car has " + sedan.seats + " seats in total");
        System.out.println();

        Bicycle bicycle = new Bicycle("Serhio", 60);
        System.out.println("Is this particular bicycle now folded? " + bicycle.isFolded);
        System.out.println("Bicycle driven by " + bicycle.driver + " has achieved max speed of " + bicycle.speedCount + " km/h last week");

        System.out.println();

        bus.checkTechnicalCondition();
        System.out.println();
        motorbike.checkTechnicalCondition();
        System.out.println();
        car.checkTechnicalCondition();
        System.out.println();
        truck.checkTechnicalCondition();
        System.out.println();
        sedan.checkTechnicalCondition();
        System.out.println();
        bicycle.checkTechnicalCondition();
        System.out.println();*/

        //* * * HOMEWORK 8_Enhanced Vehicle Park* * *
        Sedan mitsubishi = new Sedan("Alfredo", "AA-0123", 5);
        Sedan nissan = new Sedan("Antonio", "AB-1234", 5);
        Sedan lexus = new Sedan("Carlos", "AC-2345", 4);
        Car audi = new Car("Diego", "AD-3456");
        Car bmw = new Car("Hoolio", "AE-4567");
        Truck volvo = new Truck("Mario", "ZA-9876", 2300.01);
        Vehicle opel = new Vehicle("Mateo");
        Truck dacia = new Truck("Pedro", "ZC-7654", 1758.03);
        Truck volkswagen = new Truck("Santiago", "ZD-6543", 1999.04);
        Vehicle toyota = new Vehicle("Sergio");

        Vehicle[] carsBrands = new Vehicle[] {mitsubishi, nissan, lexus, audi, bmw, volvo, opel, dacia, volkswagen, toyota};

        for (Vehicle v : carsBrands) {
            v.getDriverInfo();
            v.wash();
            System.out.println();
        }




    }
}
