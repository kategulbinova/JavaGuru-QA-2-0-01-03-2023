package aleksejs_lukins.PracticeLesson8VehiclePark;

public class VehicleManagement {

    public static void main(String[] args) {

        Vehicle bus = new Vehicle("Alex");
        Vehicle moto = new Vehicle();
        Car audi = new Car("Dmitry", "HV510");
        Bicycle littleBicycle = new Bicycle("Victor", 24);
        Truck man = new Truck("Vasily", "MF2132", 16000);
        Sedan opel = new Sedan("Irina", "OD-1434", 5);

        bus.checkTechnicalCondition();
        bus.getDriverInfo();

        moto.checkTechnicalCondition();
        moto.getDriverInfo();

        audi.getDriverInfo();
        audi.wash();
        audi.checkTechnicalCondition();

        littleBicycle.getDriverInfo();
        littleBicycle.fold();
        System.out.println("Is bicycle folded now: " + littleBicycle.isFolded);
        littleBicycle.checkTechnicalCondition();

        man.loadUp();
        man.wash();
        man.checkTechnicalCondition();

        opel.checkTechnicalCondition();


    }
}
