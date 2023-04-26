package lpudnika.homework8VehiclePark.vehiclePark;

public class AutoPark {
    public static void main(String[] args) {
        lpudnika.homework8VehiclePark.vehiclePark.Vehicle blueBus = new lpudnika.homework8VehiclePark.vehiclePark.Vehicle("Linda");
        lpudnika.homework8VehiclePark.vehiclePark.Vehicle newBike = new lpudnika.homework8VehiclePark.vehiclePark.Vehicle("Linda Pudnika");
        blueBus.getDriverInfo();
        newBike.getDriverInfo();

        lpudnika.homework8VehiclePark.vehiclePark.Car audi = new lpudnika.homework8VehiclePark.vehiclePark.Car("Janis", "NJ-1111");
        audi.getDriverInfo();
        audi.wash();

        lpudnika.homework8VehiclePark.vehiclePark.Truck toyotaTruck = new lpudnika.homework8VehiclePark.vehiclePark.Truck("Peteris", "AB-1234", 2023.4);
        toyotaTruck.getDriverInfo();
        toyotaTruck.loadUp();
        toyotaTruck.wash();

        lpudnika.homework8VehiclePark.vehiclePark.Sedan volkswagen = new lpudnika.homework8VehiclePark.vehiclePark.Sedan("Andrejs", "GR-9193", 5);
        volkswagen.getDriverInfo();
        volkswagen.wash();

        lpudnika.homework8VehiclePark.vehiclePark.Bicycle greenBicycle = new Bicycle("Olivija", 2);
        greenBicycle.getDriverInfo();
        greenBicycle.fold();

        lpudnika.homework8VehiclePark.vehiclePark.Vehicle scooter = new Vehicle();
        lpudnika.homework8VehiclePark.vehiclePark.Car nissan = new Car("Erika", "CD-1234");

        scooter.checkTechnicalCondition();
        nissan.checkTechnicalCondition();

        lpudnika.homework8VehiclePark.vehiclePark.Truck myTruck = new Truck("Jevgenijs", "BB-0000", 3202.4);
        myTruck.checkTechnicalCondition();

    }
}
