package gleb.Homework.Homework6;

public class Homework6part1FibonacciNumbers {
    static void calculateFibonacci(int[] arr) {
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " : ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        printArray(numbers);
        calculateFibonacci(numbers);
        printArray(numbers);
    }
}

