package teacher;

public class CalculateFibonacciRow {

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + "; ");
        }
        System.out.println();
    }

    static void calculateFibonacci(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            arr[i] = 1;
            if (i>=2) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
    }
    public static void main(String[] args) {
        int[] fibonacciRow = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        printArray(fibonacciRow);
        calculateFibonacci(fibonacciRow);
        printArray(fibonacciRow);
    }

}
