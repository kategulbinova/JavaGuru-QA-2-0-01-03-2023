package Kristiana.vehicleParking;

public class MainProgram {
    public static void main(String[] args) {

        Vehicle bus = new Vehicle ("Kristiana");
        Vehicle motorcycle = new Vehicle ("Diana");
        bus.getDriverInfo();
        motorcycle.getDriverInfo();

        Car bmw = new Car("Masha", "MR-7777");
        bmw.getDriverInfo();
        bmw.wash();

        Bicycle myBicycle = new Bicycle("Pavel",20);
        myBicycle.getDriverInfo();
        myBicycle.fold();

        Truck bigTruck = new Truck("Konstantin","KR-2707",500);
        bigTruck.getDriverInfo();
        bigTruck.loadUp();
        bigTruck.wash();

        Sedan blueSedan = new Sedan("Stas","HA-0087", 5);
        blueSedan.getDriverInfo();
        blueSedan.wash();

        Vehicle scooter = new Vehicle("Ben");
        Car nissan = new Car("Anastasia","KK-2222");

        scooter.checkTechnicalCondition();
        nissan.checkTechnicalCondition();

        Truck middleTruck = new Truck("Janis", "RR-2223",2879.3);
        middleTruck.checkTechnicalCondition();

        System.out.println(" "); //homework starts here

        Car audi = new Car("Vladislav","MS-8796");
        Car jeep = new Car("Stanislav","AN-8979");
        Car mercedes = new Car("Jekaterina","KL-8888");
        Truck blueTruck = new Truck("Marija","PU-4334",658.9);
        Truck redTruck = new Truck("Zinaida","RT-9499",998.4);
        Truck yellowTruck = new Truck("Lolita","KK-32342",876.3);
        Sedan mySedan = new Sedan("Grigorij","KL-3232",5);
        Sedan myWorkCar = new Sedan("Rebekka","JH-9873",5);
        Sedan myHusbandCar = new Sedan("Mihails","EE-6745",5);
        Sedan mySportSedan= new Sedan("Kristiana","HH-4335",5);
        Car buggy = new Car ("Alisa","HH-3332");

        Car [] variousVehicles = { audi, jeep, mercedes, blueTruck, redTruck, yellowTruck,mySedan, myWorkCar, myHusbandCar,mySportSedan, buggy };
        for (Car info : variousVehicles) {
            info.getDriverInfo();
            info.wash();



        }


    }
}
