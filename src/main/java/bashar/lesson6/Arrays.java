package bashar.lesson6;

public class Arrays {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println();

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars2.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println();

        // Declare and initialize an array of int type with 10 different integer values.

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        // Increase each number by 5.

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 5;
            System.out.println(numbers[i]);
        }

        System.out.println();

        // Create a program that will calculate, store in an array, and print out factorials from 1! to 10!

        int[] factorials = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < factorials.length; i++) {
            int factorial = 1;

            for (int j = 1; j <= i + 1; j++) {
                factorial *= j;
            }

            factorials[i] = factorial;
            System.out.println((i + 1) + "! = " + factorials[i]);

        }
    }
}
