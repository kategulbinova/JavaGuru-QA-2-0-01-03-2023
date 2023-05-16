package margo.homeWorks.lect8InheritanceVehiclePark;

public class Car extends Vehicle{
    String numberPlate;
    public void wash() {
        System.out.println("Your car is crystal clean now!");
    }
    Car(String driver, String numberPlate){
        super(driver);
        this.numberPlate = numberPlate;
    }
    @Override
    public void checkTechnicalCondition() {
        super.checkTechnicalCondition();
        System.out.println("Car's oil level is appropriate and the headlights are leveled correctly!");
    }

}
