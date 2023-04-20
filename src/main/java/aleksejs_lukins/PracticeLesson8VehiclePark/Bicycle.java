package aleksejs_lukins.PracticeLesson8VehiclePark;

public class Bicycle extends Vehicle{
    boolean isFolded;
    int numberOfSpeeds;

    public void fold(){
        System.out.println("You bicycle is now folded");
        this.isFolded = true;
    }

    Bicycle(String driver, int numberOfSpeeds){
        super(driver);
        this.numberOfSpeeds = numberOfSpeeds;
        this.isFolded = false;
    }
}