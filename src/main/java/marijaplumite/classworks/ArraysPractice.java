package marijaplumite.classworks;

public class ArraysPractice {
    public static void main(String[] args) {
        String[] cars = {"Audi", "BMW", "Volvo", "Skoda",};
        String[] drivers = {"Janis", "Kate", "Andrejs", "Liene"};
        int[] driversAges = {56, 42, 29, 18};
        System.out.println(drivers[0]);
        System.out.println(cars.length);
        System.out.println("===============================");
        for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);
            }
        System.out.println("===============================");
        for (String i : cars) { // the same as "for (int i = 0; i < cars.length; i++)"
            System.out.println(i);
        }
        }
    }