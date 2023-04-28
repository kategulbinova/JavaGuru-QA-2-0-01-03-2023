package AlekseiKrevnev.Homeworks.vehiclePark;

public class Bicycle extends Vehicle {
    boolean isFolded;
    int speedCount;

    void fold() {
        System.out.println("Your bicycle is now folded.");
        isFolded = true;
    }
    Bicycle(String driver, int speedCount) {
        super(driver);
        this.speedCount = speedCount;
    }
}
