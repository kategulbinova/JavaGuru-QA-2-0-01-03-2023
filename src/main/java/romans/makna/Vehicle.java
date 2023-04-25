package romans.makna;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String driverName;

    public Vehicle(String make, String model, int year, String driverName) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.driverName = driverName;
    }

    public void getDriverInfo() {
        System.out.println("The driver of this " + make + " " + model + " is " + driverName);
    }

    public abstract void wash();
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String driverName) {
        super(make, model, year, driverName);
    }

    @Override
    public void wash() {
        System.out.println("Trucks are really difficult to wash!");
    }
}

class Sedan extends Vehicle {
    public Sedan(String make, String model, int year, String driverName) {
        super(make, model, year, driverName);
    }

    @Override
    public void wash() {
        System.out.println("This sedan just used the automatic carwash at the gas station. Sparkling clean!");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle[] cars = new Vehicle[10];
        cars[0] = new Truck("Ford", "F150", 2010, "John");
        cars[1] = new Sedan("Honda", "Civic", 2020, "Sarah");
        cars[2] = new Vehicle("Toyota", "Camry", 2015, "Alex") {
            @Override
            public void wash() {

            }
        };
        cars[3] = new Sedan("Nissan", "Altima", 2012, "Emily");
        cars[4] = new Vehicle("Chevrolet", "Impala", 2018, "David") {
            @Override
            public void wash() {

            }
        };
        cars[5] = new Truck("GMC", "Sierra", 2019, "Jessica");
        cars[6] = new Sedan("Ford", "Fusion", 2017, "Michael");
        cars[7] = new Vehicle("Honda", "Accord", 2016, "Laura") {
            @Override
            public void wash() {

            }
        };
        cars[8] = new Truck("Dodge", "Ram", 2014, "James");
        cars[9] = new Vehicle("Hyundai", "Elantra", 2013, "Sophia") {
            @Override
            public void wash() {

            }
        };

        for (Vehicle car : cars) {
            car.getDriverInfo();
            car.wash();
            System.out.println();
        }
    }
}

