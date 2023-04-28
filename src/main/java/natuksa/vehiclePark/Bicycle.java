package natuksa.vehiclePark;

public class Bicycle extends Vehicle{
    boolean isFolded;
    int numberOfSpeeds;
    public void fold() {
        System.out.println("Your bicycle is now folded!");
        this.isFolded = true;
    }
    Bicycle(String driver, int numberOfSpeeds) {
        super(driver);
        this.numberOfSpeeds = numberOfSpeeds;
        this.isFolded = false;
    }
}
