package svetlanakussi.homework;

public class FibonacciNumbersHomework6 {
    public static void main(String[] args) {
        int[] value = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("First 11 Fibonacci numbers: ");
        value[0] = 1;
        value[1] = 1;
        for (int i = 2; i < value.length; i++) {
            value[i] = value[i - 1] + value[i - 2];
        }
        printArray (value);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

