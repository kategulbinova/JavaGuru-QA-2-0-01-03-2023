package olgaZikova.homework8.VehiclePark;

public class VehicleManagement<cars> {
    public static void main(String[] args) {

        Vehicle car = new Vehicle();
        Vehicle motobike = new Vehicle("Olga");

        car.getDriverinfo();
        motobike.getDriverinfo();

        Car car1 = new Car("Mike", "NN1234");
        car1.wash();
        car1.getDriverinfo();

        Truck truck = new Truck("Boris", "TT3456", 12);
        truck.loadUp();
        truck.getDriverinfo();

        Sedan sedan = new Sedan("Anna", "MM7878", 5);

        Bicycle bicycle = new Bicycle("Kate", 10);
        bicycle.getDriverinfo();

        bicycle.numberOfSpeeds = 10;
        bicycle.isFolded = true;
        bicycle.fold();

        Vehicle scooter = new Vehicle();
        Car subaru = new Car("Anna", "RR12");

        scooter.checkTechnicalConditions();
        subaru.checkTechnicalConditions();


        //Homework 8

        Sedan bmw = new Sedan("Anatoly", "AR12", 5);
        Sedan audi = new Sedan("Andry", "AN15", 2);
        Sedan opel = new Sedan("ANNA", "AN17", 7);
        Truck jeep = new Truck("Anton", "AN19");
        Truck johnDeer = new Truck("Andris", "AN21");
        Truck volvo = new Truck("Anvar", "AN23");
        Truck saab = new Truck("Andy", "AN25");
        Car nissan = new Car("Antonina", "AN27");
        Car kia = new Car("Anzela", "AN27");
        Car ford = new Car("Anastasia", "AN29");

        Car[] cars = new Car[]{bmw, jeep, audi, johnDeer, volvo, saab, nissan, kia, ford, opel};
        for (Car c : cars) {
            c.wash();
            c.getDriverinfo();


        }

    }
}
