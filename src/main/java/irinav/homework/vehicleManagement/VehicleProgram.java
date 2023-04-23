package irinav.homework.vehicleManagement;


import java.util.Arrays;

public class VehicleProgram {
    public static void main(String[] args) {


        Car myNewCar = new Car("Johnson", "JC2345");
        Car myWorkCar = new Car("Mary", "BD5678");
        Car myGreenTruck = new Truck("Jack", 500.08, "LM1234");
        Car myRedTruck = new Truck("Peter", 1000.90, "MN7892");
        Car myYellowSedan = new Sedan("Ivan", "HG5698", 4);
        Car myWorkSedan = new Sedan("Maria", "KL5123", 4);
        Car myfancyCar = new Car("Edgar", "WS8521");
        Car myBlueCar = new Car("Larry", "BD3698");
        Car myPurpleSedan = new Sedan("Kevin", "AS6563", 4);
        Car myYellowTruck = new Truck("Sean", 800.20, "GH5334");

        Vehicle[] Car = {myNewCar, myWorkCar, myGreenTruck, myRedTruck, myYellowSedan,
                myWorkSedan, myfancyCar, myBlueCar, myPurpleSedan, myYellowTruck};

        System.out.println("Who is the vehicle operated by?");
        System.out.println();

        for (Vehicle v : Car){
            v.getDriverInfo();
        }
        System.out.println();
        System.out.println("Are my vehicles clean?");
        System.out.println();

        for (Vehicle i : Car){
            i.wash();
        }
        System.out.println();
        System.out.println("What are my vehicles' number plates?");
        System.out.println();

        for (Car car : Arrays.asList(myNewCar, myWorkCar, myGreenTruck, myRedTruck, myYellowSedan,
                myWorkSedan, myfancyCar, myBlueCar, myPurpleSedan, myYellowTruck)){

            System.out.println("My vehicle's number plate is: " + car.numberPlate);
        }

        System.out.println();
        System.out.println("In what technical condition are my vehicles?");
        System.out.println();

        for (Vehicle n : Car) {
            n.checkTechnicalCondition();
        }
        System.out.println();

        for (Vehicle b : Car) {
            b.showNumberOfSeats();
        }
    }
}




