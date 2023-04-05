package olga_zikova.lesson6;

public class ArraysCars {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        /*for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }*/
        System.out.println(cars);
        cars [0] = "subaru";
        System.out.println(cars);
    }
}
