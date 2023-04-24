package NikitaS.CWandHW8AutoparkWash;

public class Autopark {
    public static void main(String[] args) {
        /*Vehicle bus = new Vehicle();
        Vehicle motorcycle = new Vehicle("Jack");
        Car car = new Car("Nick", "XYZ123");
        Truck truck = new Truck ("John", "HEY528", 500);
        Sedan sedan = new Sedan ("Robert", "NY1234", 5);
        Bicycle bicycle = new Bicycle ("Elza", 12);
        System.out.println(bus.getDriverInfo());
        System.out.println(motorcycle.getDriverInfo());
        System.out.println(car.getDriverInfo());
        System.out.println(truck.getDriverInfo());
        System.out.println(sedan.getDriverInfo());
        System.out.println(bicycle.getDriverInfo());

        Vehicle scooter = new Vehicle();
        Car nissan = new Car("Kate", "BG-1023");
        scooter.checkTechnicalCondition();;
        nissan.checkTechnicalCondition();

        Truck myTruck = new Truck("Janis", "A-02", 2500);
        myTruck.checkTechnicalCondition(); */

        Truck truck1 = new Truck("Chuck", "I-X02", 3000);
        Sedan sedan1 = new Sedan ("Jackie", "777", 5);
        Car car1 = new Car ("Suzy", "XE-5876");
        Vehicle vehicle1 = new Vehicle ("Robert");
        Truck truck2 = new Truck("Mr.Fun", "T-2000", 5000);
        Car car2 = new Car ("Romero", "CUBA4EVER");
        Vehicle vehicle2 = new Vehicle ("Casey");
        Truck truck3 = new Truck("Ivan", "EKH15", 2000);
        Sedan sedan3 = new Sedan("Chad", "IKOOL69", 4);
        Car car3 = new Car ("Sherlock", "BAKER");

        Vehicle[] groupOfVehicles = {truck1, sedan1, car1, vehicle1, truck2, car2, vehicle2, truck3, sedan3, car3};

        for (Vehicle v : groupOfVehicles) {
            System.out.println(v.getDriverInfo());
            v.wash();
            System.out.println();
        }
    }
}
