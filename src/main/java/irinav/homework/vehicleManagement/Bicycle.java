package irinav.homework.vehicleManagement;


    public class Bicycle extends Vehicle {
        boolean isFolded;
        int numberOPdSpeeds;

        void fold() {
            System.out.println("Your bicycle is now folded.");
            isFolded = true;
        }
        Bicycle(String driver, int numberOPdSpeeds) {
            this.driver = driver;
            this.numberOPdSpeeds = numberOPdSpeeds;
        }
    }

