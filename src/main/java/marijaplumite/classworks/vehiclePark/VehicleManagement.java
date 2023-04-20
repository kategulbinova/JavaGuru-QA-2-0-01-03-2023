package marijaplumite.classworks.vehiclePark;

public class VehicleManagement {
    public static void main(String[] args) {
        Vehicle bus = new Vehicle();
        Vehicle motorcycle = new Vehicle("Michael");

        bus.getDriverInfo();
        motorcycle.getDriverInfo();

        Car bmw = new Car("Marija", "MP-325");
        bmw.getDriverInfo();
        bmw.wash();

        Truck skania = new Truck("John", "TR-4596", 2013.96);
        skania.getDriverInfo();
        skania.loadUp();

        Sedan myLittleCar = new Sedan("Alice", "AW-854", 4);
        myLittleCar.getDriverInfo();

        Bicycle myBicycle = new Bicycle("Paul", 11);
        myBicycle.getDriverInfo();
        myBicycle.fold();

        Vehicle scooter = new Vehicle();
        Car redCar = new Car("Anna", "AR-8888");

        scooter.checkTechnicalCondition();
        redCar.checkTechnicalCondition();
        System.out.println();


        // Homework :

        Car[] cars = new Car[10];
        cars[0] = new Car("Hetty", "KR-456");
        cars[1] = new Sedan("Travis", "MN-O789", 6);
        cars[2] = new Truck("Bob", "RN-012", 2056.54);
        cars[3] = new Car("Jane", "TU-34");
        cars[4] = new Sedan("Tom", "VWX678", 6);
        cars[5] = new Sedan("Sam", "ST-9966", 2);
        cars[6] = new Sedan("Alen", "HG-8574", 4);
        cars[7] = new Truck("Ramy", "TS-9956", 1500);
        cars[8] = new Car("Rihana", "MJ-5548");
        cars[9] = new Car("Koby", "KB-3644");

        for (Car car : cars) {
            car.getDriverInfo();
            car.wash();
        }
    }
}
