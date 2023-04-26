package lpudnika.homework8VehiclePark.vehiclePark;

public class AutoParkUpdated {
    public static void main(String[] args) {
        //defining the array of 10 vehicles
        Vehicle[] vehicles = new Vehicle[10];

        //fill in the array with different values
        vehicles[0] = new Car("Marija", "AB-1234");
        vehicles[1] = new Truck("Mihails", "KL-1234", 3000);
        vehicles[2] = new Car("Samanta", "MN-5678");
        vehicles[3] = new Car("Marta", "GH-3456");
        vehicles[4] = new Sedan("Elizabete", "CD-5678", 4);
        vehicles[5] = new Truck("Ernests", "EF-9012", 2000);
        vehicles[6] = new Truck("Inga", "RS-3456", 3500);
        vehicles[7] = new Sedan("Peteris", "IJ-7890", 5);
        vehicles[8] = new Car("Toms", "TU-7890");
        vehicles[9] = new Sedan("Mikelis", "OP-9012", 4);

        //using loop, call method getDriverInfo() for each of the cars
        //using loop, call method wash() for each of the cars and notice the difference
        for (Vehicle vehicle : vehicles) {
            vehicle.getDriverInfo();
            vehicle.getNumberPlate();
            vehicle.wash();
            System.out.println();
        }
    }
}
