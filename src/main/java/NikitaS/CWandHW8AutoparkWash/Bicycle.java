package NikitaS.CWandHW8AutoparkWash;

public class Bicycle extends Vehicle{
    Boolean isFolded;
    int numberOfSpeeds;

    public String fold() {
        isFolded = true;
        return ("Your bicycle is now folded");
    }
    Bicycle (String driver, int numberOfSpeeds) {
        super(driver);
        this.numberOfSpeeds = numberOfSpeeds;
        isFolded = false;
    }
}
