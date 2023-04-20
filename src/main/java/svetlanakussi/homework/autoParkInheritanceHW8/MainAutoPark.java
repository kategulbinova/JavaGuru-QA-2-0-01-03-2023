package svetlanakussi.homework.autoParkInheritanceHW8;

public class MainAutoPark {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new Car("Honda", "yellow", "Janis", "JT-157");
        vehicles[1] = new Sedan("Toyota", "blue", "Mara", "AN-2586");
        vehicles[2] = new Truck("Ford", "black", "Liana", "BK-5471");
        vehicles[3] = new Car("Chevrolet", "green", "Karlis", "CS-6681");
        vehicles[4] = new Truck("Raw", "white", "Peteris", "DM-472");
        vehicles[5] = new Sedan("Nissan", "pink", "Ramona", "EE-9598");
        vehicles[6] = new Car("Mazda", "red", "Gatis", "FR-3176");
        vehicles[7] = new Truck("Volvo", "violet", "Tomas", "GI-4826");
        vehicles[8] = new Car("Kia", "grey", "Sintija", "HH-4268");
        vehicles[9] = new Sedan("Hyundai", "purple", "Loreta", "ID-8887");

        for (Vehicle vehicle : vehicles) {
            vehicle.getDriverInfo();
        }
        System.out.println("Car washing process :");

        for (Vehicle vehicle : vehicles) {
            vehicle.wash();
        }
    }
}

