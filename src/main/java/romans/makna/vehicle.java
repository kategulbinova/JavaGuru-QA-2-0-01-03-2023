package romans.makna;
class Vehicle {
    private String driverName;

    public Vehicle(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverInfo() {
        return "Driver name: " + driverName;
    }

    public void wash() {
        System.out.println("This vehicle is being washed.");
    }
}

class Car extends Vehicle {
    public Car(String driverName) {
        super(driverName);
    }

    @Override
    public void wash() {
        System.out.println("This car is being washed.");
    }
}

class Truck extends Car {
    public Truck(String driverName) {
        super(driverName);
    }

    @Override
    public void wash() {
        super.wash();
        System.out.println("Trucks are really difficult to wash!");
    }
}

class Sedan extends Car {
    public Sedan(String driverName) {
        super(driverName);
    }

    @Override
    public void wash() {
        System.out.println("This sedan just used the automatic carwash at the gas station. Sparkling clean!");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new Sedan("John");
        vehicles[1] = new Sedan("Jane");
        vehicles[2] = new Sedan("Bob");
        vehicles[3] = new Truck("Mike");
        vehicles[4] = new Truck("Sara");
        vehicles[5] = new Car("Dave");
        vehicles[6] = new Car("Alice");
        vehicles[7] = new Car("Tom");
        vehicles[8] = new Car("Jenny");
        vehicles[9] = new Car("Peter");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getDriverInfo());
            vehicle.wash();
            System.out.println();
        }
    }
}
