package margo.homeWorks.lect8InheritanceVehiclePark;

public class Bicycle extends Vehicle{
    int speedCount;
    boolean isFolded;
    public void fold() {
        System.out.println("Your bicycle is now folded.");
        isFolded = true;
    }
    Bicycle(String driver, int speedCount) {
        super(driver);
        this.speedCount = speedCount;
        isFolded = false;

    }
}
