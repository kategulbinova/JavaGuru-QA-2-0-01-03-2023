package gleb.Homework.VehiclePark;

public class Bicycle extends Vehicle {
    boolean isFolded;
    int numberOfSpeeds;

    void fold() {
        this.isFolded=true;
        System.out.println("Your bicycle is folded ");
    }
    public Bicycle(String driver,int numberOfSpeeds) {
        super(driver);
        this.numberOfSpeeds=numberOfSpeeds;
        this.isFolded=false;

    }
}
