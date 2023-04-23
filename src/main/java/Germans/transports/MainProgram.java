package germans.transports;

public class MainProgram {
    public static void main(String[] args) {
        germans.transports.Vehicle yellowBus = new germans.transports.Vehicle("Anatoly");
        germans.transports.Vehicle myBike = new germans.transports.Vehicle("Elina Zarina");
        yellowBus.getDriverInfo();
        myBike.getDriverInfo();

        germans.transports.Car toyota = new germans.transports.Car("Jekaterina", "JG-992");
        toyota.getDriverInfo();
        toyota.wash();

        germans.transports.Truck l22 = new germans.transports.Truck("Ivan", "AA-001", 2011.5);
        l22.getDriverInfo();
        l22.loadUp();
        l22.wash();

        germans.transports.Sedan myLittleCar = new Sedan("Mama", "NC-6411", 5);
        myLittleCar.getDriverInfo();
        myLittleCar.wash();

        germans.transports.Bicycle myBlueBike = new Bicycle("Teddy", 10);
        myBlueBike.getDriverInfo();
        myBlueBike.fold();

        germans.transports.Vehicle scooter = new Vehicle();
        germans.transports.Car nissan = new Car("Kate", "BG-1023");

        scooter.checkTechnicalCondition();
        nissan.checkTechnicalCondition();

        germans.transports.Truck myTruck = new Truck("Janis", "A-02", 2500.11);
        myTruck.checkTechnicalCondition();

    }
}
