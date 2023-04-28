package natuksa.vehiclePark;

public class VehicleManagement {
    public static void main (String[] args){
      /*  Vehicle bus = new Vehicle("Jake");
        Vehicle motocycle = new Vehicle("Isabella");
        Car volvo = new Car("John", "KL-4783");
        Truck jeep = new Truck("Morpheus", "KN-2312", 123.45);
        Bicycle mountain = new Bicycle("Billy", 6);
        Sedan astra = new Sedan("Alladin", "BH-6723", 4);
        bus.getDriverInfo();
        motocycle.getDriverInfo();
        volvo.getDriverInfo();
        jeep.getDriverInfo();
        mountain.getDriverInfo();
        astra.getDriverInfo();
        mountain.checkTechnicalCondition();
        jeep.checkTechnicalCondition();
        volvo.checkTechnicalCondition();                class work      */
        Truck jeep = new Truck("Morpheus", "KN-2312", 123.45);
        Truck landRover = new Truck("John", "KJ-2351", 32.65);
        Truck minivan = new Truck("Annie", "GB-8731", 35.76);
        Truck pickup = new Truck("Niklaus", "TR-7194", 98.15);
        Truck freeLander = new Truck("Helena", "LA-6661", 18.18);
        Sedan astra = new Sedan("Alladin", "BH-6723", 4);
        Sedan ptCruiser = new Sedan("Lucia", "JG-7282", 5);
        Sedan lada = new Sedan("Alucard", "HG-8385", 4);
        Sedan insignia = new Sedan("Bennie", "LK-9081", 2);
        Sedan vectra = new Sedan("Cristie", "UG-6563", 5);
        Car[] cars = new Car[] {jeep, landRover, minivan, pickup, freeLander, astra, ptCruiser, lada, insignia, vectra};
        for (Car car : cars) {
            car.getDriverInfo();
        }
        for (Car car : cars) {
            car.wash();
        }
    }
}
