package irinav.homework.vehicleManagement;

 public class Car extends Vehicle{

     String numberPlate;

    @Override
    public void wash(){
        System.out.println("Your car is now clean!");
    }


    public Car(String driver, String numberPlate) {
        this.driver = driver;
       //super(driver);
        this.numberPlate = numberPlate;
    }
     @Override
    void checkTechnicalCondition(){
         super.checkTechnicalCondition();
         System.out.println("Car's oil level is sufficient.");}
 }
