package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani.Vehicle;

public class TransportationManagement {
    public static void main(String[] args) {
        Vehicle bus = new Vehicle();
        Vehicle motorbike = new Vehicle("Oliver");
        bus.getDriverInfo();
        motorbike.getDriverInfo();
        Car reno = new Car("76839PN", "John");
        Bicycle someBicycleBrand = new Bicycle("Tom", 100 );
        Sedan sedan = new Sedan ("Tim", "157UI", 5);
        Truck scania = new Truck ("74895YI", "Jim", 9000);
        sedan.getDriverInfo();
        reno.getDriverInfo();
        someBicycleBrand.getDriverInfo();
        scania.getDriverInfo();
        Vehicle vehicle = new Vehicle("Steve");
        Car car = new Car("7563PO", "Steven");
        Truck truck = new Truck("8235IK", "Stenver", 60);
        Bicycle bicycle = new Bicycle("Ramy", 76);
        vehicle.checkTechnicalCondition();
        car.checkTechnicalCondition();
        truck.checkTechnicalCondition();
        bicycle.checkTechnicalCondition();
        Vehicle opel = new Vehicle("khara");

        Vehicle[] carTypes = {reno, opel, car, vehicle, bicycle, truck, sedan, scania, bus, motorbike};

        for (int i = 0; i < carTypes.length; i++) {
            carTypes[i].getDriverInfo();

        }


        Car[] cars = {reno, car, truck, sedan, scania};

        for (int i = 0; i < cars.length; i++) {
            cars[i].wash();
        }

    }
}
