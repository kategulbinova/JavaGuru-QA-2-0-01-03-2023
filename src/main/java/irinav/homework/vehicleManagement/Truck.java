package irinav.homework.vehicleManagement;

public class Truck extends Car{
    double maxLoad;

    void showMaxLoad(){
        System.out.println("Your truck is fully loaded.");
    }

    @Override
    public void wash(){
        super.wash();
        System.out.println("Trucks are really difficult to wash!");}

   Truck(String driver, String numberPlate) {
       super(driver, numberPlate);
       this.maxLoad =0;
   }

   Truck(String driver, double maxLoad, String numberPlate) {
       super(driver, numberPlate);
       this.maxLoad =maxLoad;
   }

    @Override
   void checkTechnicalCondition() {
        System.out.println("This truck is in a wonderful state!");
    }

 }



