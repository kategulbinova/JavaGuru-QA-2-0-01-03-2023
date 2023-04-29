package gleb.Homework.VehiclePark;

public class Car extends Vehicle {
    String numberPlate;

    void wash() {
        System.out.println("Your car is squeaky clean!");
    }
    @Override
    void checkTechnicalCondition(){
        super.checkTechnicalCondition();
        System.out.println("Car’s oil level is appropriate, and the headlights are leveled correctly.");

    }
    public Car(String driver,String numberPlate) {
       super(driver);
       this.numberPlate=numberPlate;
    }
}
