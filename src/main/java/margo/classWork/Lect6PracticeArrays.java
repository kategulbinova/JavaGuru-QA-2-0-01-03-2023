package margo.classWork;

public class Lect6PracticeArrays {
    public static void main(String[] args) {
        System.out.println("Practice: cars");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


        /*System.out.println();
        System.out.println("Practice: increase nr by 5");
        int[] originalNr = {45, 87, 23, 2, -15, 67, 1005, -1235, -1076652, 0};
        for (int a : originalNr) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a = 0; a < originalNr.length; a++) {
            originalNr[a] = originalNr[a]+5;
            System.out.print(originalNr[a] + " ");
        }*/

        System.out.println();
        System.out.println("Practice: increase nr by 5");
        int[] originalNr = {45, 87, 23, 2, -15, 67, 1005, -1235, -1076652, 0};
        int[] numbers = originalNr.clone();
        System.out.println();
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = numbers[a]+5;
            // below 2 commented out need to be in this loop
        }

        //System.out.print(originalNr[a] + " ");
        System.out.println("OrigNumbers");
        for (int a = 0; a < originalNr.length; a++) {
            System.out.print(originalNr[a] + " ");
        }
        //System.out.print(numbers[a] + " ");
        System.out.println("\nIncrementedNumbers");
        for (int a = 0; a < numbers.length; a++) {
            System.out.print(numbers[a] + " ");
        }
    }
}
