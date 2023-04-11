package bashar.lesson6;

public class FibonacciHomework {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] fibonacciArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;

        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
        }

        printArray(fibonacciArray);
    }
}
