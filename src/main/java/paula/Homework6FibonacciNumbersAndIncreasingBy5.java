package paula;

public class Homework6FibonacciNumbersAndIncreasingBy5 {
    public static void main(String[] args) {
        int[] numbers = new int[11];
        fillArrayWithFibonacciNumbers(numbers);

        System.out.println("Array with 11 Fibonacci numbers: ");
        printArray(numbers);

        increaseArrayByFive(numbers);

        System.out.println();
        System.out.println("Increased array by 5 with 11 Fibonacci numbers: ");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void increaseArrayByFive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
    }

    public static void fillArrayWithFibonacciNumbers(int[] arr) {
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
}