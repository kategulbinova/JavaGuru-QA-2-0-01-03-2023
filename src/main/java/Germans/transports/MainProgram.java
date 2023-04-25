package germans.transports;

public class MainProgram {
    public static void main(String[] args) {
      /*germans.transports.Vehicle yellowBus = new germans.transports.Vehicle("Anatoly");
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
        myTruck.checkTechnicalCondition();*/
        Truck landCruiser = new Truck("Anatoly", "GH-2322", 122.45);
        Sedan avensis = new Sedan("Grigoriy", "AH-2456", 5);
        Sedan passat  = new Sedan("German", "MH-1322", 5);
        Sedan camry = new Sedan("Vasiljs", "DA-2300", 5);
        Truck vaz = new Truck("Sergejs", "GEZ-2322", 200.45);
        Truck traktor = new Truck("Arturs", "WW-2322", 333.45);
        Sedan Astra = new Sedan("Nikita", "UU-1220", 5);
        Truck Hilius = new Truck("Valentins", "TE-1223", 152.45);
        Truck Tacoma = new Truck("Artjems", "AA-2222", 129.45);
        Truck landRover = new Truck("Pavels", "YT-2344", 172.45);
        Car[] cars = new Car[] {landCruiser,avensis,passat,camry,vaz,traktor,Astra,Hilius,Tacoma,landRover};
        for (Car car : cars) {
            car.getDriverInfo();
        }
        for (Car car :cars) {
            car.wash();
        }
    }
}
