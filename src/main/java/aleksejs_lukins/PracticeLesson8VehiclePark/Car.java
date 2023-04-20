package aleksejs_lukins.PracticeLesson8VehiclePark;

public class Car extends Vehicle{
    String numberPlate;

    public void wash() {
        System.out.println("Car is clean now");
    }

    Car(String driver, String numberPlate){
        getDriverInfo();
        this.numberPlate = numberPlate;
    }

    @Override
    public void checkTechnicalCondition(){
        System.out.println("Car oil level is fine and lights are working");
        super.checkTechnicalCondition();
    }
}
