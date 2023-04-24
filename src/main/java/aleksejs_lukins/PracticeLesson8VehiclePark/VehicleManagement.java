package aleksejs_lukins.PracticeLesson8VehiclePark;

public class VehicleManagement {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("-START OF PRACTICE PART-");
        System.out.println();

        Vehicle bus = new Vehicle("Alex");
        Vehicle moto = new Vehicle();
        Car audi = new Car("Dmitry", "HV-510");
        Bicycle littleBicycle = new Bicycle("Victor", 24);
        Truck man = new Truck("Vasily", "MF-2132", 16000);
        Sedan opel = new Sedan("Irina", "OD-1434", 5);
        Truck dacia = new Truck("Ivan", "NF-3234", 14000);
        Sedan kia = new Sedan("Kiril", "KE-3244", 4);
        Car seat = new Car("Andris", "NT-324");
        Vehicle tricycle = new Vehicle("Ashot");
        Truck volvo = new Truck("Dinar", "VE-324", 12000);

        Vehicle[] variousVehicles = {bus, moto, audi, man, opel, dacia, kia, seat, tricycle, volvo};
        Car[] variousCars = {audi, man, opel, dacia, kia, seat, volvo};

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

        System.out.println();
        System.out.println("-START OF HOMEWORK PART WITH DRIVER INFO-");
        System.out.println();

        for (Vehicle i : variousVehicles) {
            i.getDriverInfo();
        }

        System.out.println();
        System.out.println("-HOMEWORK PART WITH WASHING-");
        System.out.println();

        for (Car m : variousCars) {
            m.wash();
        }

    }
}
