package AlekseiKrevnev.vehiclePark;

public class Main {
    public static void main(String[] args) {
        Vehicle skoda = new Vehicle("Aleksej");
        Vehicle honda = new Vehicle("Tatjana");
        skoda.getDriverInfo();
        honda.getDriverInfo();

        Car miniCooper = new Car("Nicole", "NK-7777");
        miniCooper.getDriverInfo();
        miniCooper.wash();

        Truck skania = new Truck("Jesenija", "JK-8888", 8000.5);
        skania.getDriverInfo();
        skania.loadUp();
        skania.wash();

        Sedan mazda = new Sedan("Cousin", "CP-6", 5);
        mazda.getDriverInfo();
        mazda.wash();

        Bicycle speedyBoo = new Bicycle("Teddy", 10);
        speedyBoo.getDriverInfo();
        speedyBoo.fold();

        Vehicle segway = new Vehicle();
        Car audi = new Car("Ilona", "IK-3536");

        segway.checkTechnicalCondition();
        audi.checkTechnicalCondition();

        Truck pickup = new Truck("Max", "Ak-47", 3000.5);
        pickup.checkTechnicalCondition();

    }
}
