package gleb.Homework.VehiclePark;

public class VehicleManagement {
    public static void main(String[] args) {
        Vehicle bus = new Vehicle();
        Vehicle motorcycle = new Vehicle("Demo");


        bus.getDriverInfo();
        motorcycle.getDriverInfo();
        System.out.println("");

        //Step 8
        Car audi = new Car("Gleb", "MR-4200");
        audi.getDriverInfo();
        audi.wash();
        System.out.println("");

        Truck volvo = new Truck("Mihail", "A-0000", 20000);
        volvo.getDriverInfo();
        volvo.loadUp();
        volvo.wash();
        System.out.println("");

        Sedan avant = new Sedan("Gleb", "MR-4200", 5);
        avant.getDriverInfo();
        avant.wash();
        System.out.println("");

        Bicycle porcheBicycle = new Bicycle("Aleksey", 12);
        porcheBicycle.getDriverInfo();
        porcheBicycle.fold();
        System.out.println("");

        System.out.println("Homework :");

        // Car[] cars = new Car[10];
        //cars[1] = new Car("Jeff", "AD-1322");
        // cars[2] = new Car("Kim", "BD-6699");
        // cars[3] = new Car("Jayden", "JA-1277");
        //cars[4] = new Car("Cliff", "MG-6666");
        //cars[5] = new Truck("Lexa", "OH-3333", 3000);
        // cars[6] = new Truck("Miha", "AH-0001", 5000);
        //cars[7] = new Truck("Volodya", "NU-0080", 4000);
        //cars[8] = new Truck("Vlad", "DA-0010", 3500);
        //cars[9] = new Sedan("John", "AP=1313", 6);
        //cars[10] = new Sedan("Walt", "GJ-6453", 4);

        // for (Car car : cars) {
        //    car.getDriverInfo();
        //   car.wash();


        }
    }

