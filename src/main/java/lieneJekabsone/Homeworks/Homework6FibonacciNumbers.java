package lieneJekabsone.Homeworks;

public class Homework6FibonacciNumbers {

    static void printArray() {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    static void printFibonacci() {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        printArray();
        System.out.println();
        printFibonacci();
    }
}
