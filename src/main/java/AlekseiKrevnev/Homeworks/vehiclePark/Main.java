package AlekseiKrevnev.Homeworks.vehiclePark;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new Sedan("Toyota", "Camry", 2019, "A.Irbe.");
        vehicles[1] = new Sedan("Honda", "Accord", 2020, "S.Ozolins.");
        vehicles[2] = new Sedan("Skoda", "Superb", 2018, "E.Merzlikins.");
        vehicles[3] = new Truck("Ford", "Maverick", 2021, "K.Sotnieks.");
        vehicles[4] = new Truck("Chevrolet", "Colorado", 2015, "K.Ankipans.");
        vehicles[5] = new Truck("Toyota", "Tundra", 2022, "A.Abols.");
        vehicles[6] = new Car("Tesla", "Model S", 2021, "M.Redlihs.");
        vehicles[7] = new Car("Toyota", "Camry", 2016, "H.Vitolins.");
        vehicles[8] = new Car("Honda", "CRV", 2020, "M.Indrasis.");
        vehicles[9] = new Car("VW", "Passat", 2015, "R.Kenins.");

        for (Vehicle vehicle : vehicles) {
            vehicle.getDriverInfo();
        }

        System.out.println("Washing cars...");

        for (Vehicle vehicle : vehicles) {
            vehicle.wash();
            System.out.println();
        }
    }
}