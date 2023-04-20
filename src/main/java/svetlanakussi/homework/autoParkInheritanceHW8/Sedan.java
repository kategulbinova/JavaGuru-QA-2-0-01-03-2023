package svetlanakussi.homework.autoParkInheritanceHW8;

public class Sedan extends Car {
    public Sedan (String brand, String color, String driver, String numberPlate) {
        super(brand, color, driver, numberPlate);
    }
    @Override
    public void wash() {
        System.out.println("This sedan just used the automatic carwash at the gas station. Sparkling clean!");
    }
}
