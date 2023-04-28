package svetlanakussi.homework.autoParkInheritanceHW8;

public class Truck extends Car {
    public Truck (String brand, String color, String driver, String numberPlate) {
        super(brand, color, driver, numberPlate);
    }

    @Override
    public void wash() {
        super.wash();
        System.out.println("Trucks are really difficult to wash!");
    }
}



