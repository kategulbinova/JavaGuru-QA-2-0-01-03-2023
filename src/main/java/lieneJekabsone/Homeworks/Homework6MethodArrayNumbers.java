package lieneJekabsone.Homeworks;

public class Homework6MethodArrayNumbers {

    static void printArray() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    static void printArrayPlusFive() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 5;
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {

        printArray();
        System.out.println();
        printArrayPlusFive();
    }
}
