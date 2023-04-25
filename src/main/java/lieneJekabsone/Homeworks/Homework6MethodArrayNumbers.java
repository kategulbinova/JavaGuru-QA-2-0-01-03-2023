package lieneJekabsone.Homeworks;

public class Homework6MethodArrayNumbers {

    static void printArray() {
        int[] numbers = {-4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    static void printArrayPlusFive() {
        int[] numbers = {-4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        printArray();
        System.out.println();
        printArrayPlusFive();
    }
}
