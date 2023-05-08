package paula.homework.inheritanceAutoparkUpd;

public class MainProgram {

    public static void main(String[] args) {
       /* Vehicle yellowBus = new Vehicle("Sergejs");
        Vehicle myBike = new Vehicle("Paula");
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
        myTruck.checkTechnicalCondition();*/

        Sedan skoda = new Sedan("Vjaceslavs", "LL0011", 5);
        Sedan jeep = new Sedan("Janis", "OP8745", 5);
        Car volkswagen = new Car("Evita", "MM86541");
        Sedan bmw = new Sedan("Zanna", "MA85", 5);
        Truck ssangYong = new Truck("Vitja", "KL2354");
        Truck ford = new Truck("Jevgenijs", "AA8945", 2100.5);
        Sedan porsche = new Sedan("Larisa", "SL21", 5);
        Car mazda = new Car("Vitols", "TR9856");
        Truck opel = new Truck("Semjon", "ZK6378", 2500.4);
        Car rangeRover = new Car("Ekaterina", "PO88");

        Car[] cars = new Car[] {skoda, jeep, volkswagen,bmw, ssangYong, ford, porsche, mazda, opel, rangeRover};
        for (Car car: cars) {
            car.getDriverInfo();
            car.wash();

            System.out.println();
        }
    }

}
