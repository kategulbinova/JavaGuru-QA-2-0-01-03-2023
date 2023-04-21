package teacher.autoPark;

public class MainProgram {
    public static void main(String[] args) {
        Vehicle yellowBus = new Vehicle("Anatoly");
        Vehicle myBike = new Vehicle("Elina Zarina");
        yellowBus.getDriverInfo();
        myBike.getDriverInfo();

        Car toyota = new Car("Jekaterina", "JG-992");
        toyota.getDriverInfo();
        toyota.wash();

        Truck l22 = new Truck("Ivan", "AA-001", 2011.5);
        l22.getDriverInfo();
        l22.loadUp();
        l22.wash();

        Sedan myLittleCar = new Sedan("Mama", "NC-6411", 5);
        myLittleCar.getDriverInfo();
        myLittleCar.wash();

        Bicycle myBlueBike = new Bicycle("Teddy", 10);
        myBlueBike.getDriverInfo();
        myBlueBike.fold();

        Vehicle scooter = new Vehicle();
        Car nissan = new Car("Kate", "BG-1023");

        scooter.checkTechnicalCondition();
        nissan.checkTechnicalCondition();

        Truck myTruck = new Truck("Janis", "A-02", 2500.11);
        myTruck.checkTechnicalCondition();

    }
}
