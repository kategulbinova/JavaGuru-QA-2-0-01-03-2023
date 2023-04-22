package irinav.homework.vehicleManagement;

import java.util.Arrays;

public class VehicleProgram {
    public static void main(String[] args) {
       String a;

    Car myNewCar = new Car("Johnson","JC2345");
    Car myWorkCar = new Car("Mary","BD5678");
    Car myGreenTruck = new Truck("Jack",500,"LM1234");
    Car myRedTruck = new Truck("Peter", 1000, "MN7892");
    Car myYellowSedan = new Sedan("Ivan", "HG5698",4 );
    Car myWorkSedan = new Sedan("Maria","KL5123",4);
    Car myfancyCar = new Car("Edgar","WS8521");
    Car myBlueCar = new Car("Larry","BD3698");
    Car myPurpleSedan = new Sedan("Kevin", "AS6563",4);
    Car myYellowTruck = new Truck("Sean",800,"GH5334");

    Vehicle[] Car= {myNewCar, myWorkCar, myGreenTruck, myRedTruck,myYellowSedan,
                myWorkSedan, myfancyCar, myBlueCar, myPurpleSedan, myYellowTruck};

   for(Vehicle v:Car){
       v.getDriverInfo();
   }
   System.out.println();

   for(Vehicle i: Car){
       i.wash();
   }
   for (Car car : Arrays.asList(myBlueCar, myYellowSedan)) {
            System.out.println(car.numberPlate);
      }
   for(Vehicle n: Car){
      n.checkTechnicalCondition();
      }
   }
}



