package YanaItani.Vehicle;

public class Bicycle extends Vehicle{
    boolean isFolded;
    int numberOfSpeeds;

    void fold(){
        System.out.println("Your bicycle is now folded");
        this.isFolded = true;

    }

    public Bicycle(String driver, int numberOfSpeeds) {
        super(driver);
        this.numberOfSpeeds = numberOfSpeeds;
        this.isFolded = false;
    }
}
