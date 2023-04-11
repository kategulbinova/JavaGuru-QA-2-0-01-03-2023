package aleksejs_lukins;

public class Homework6FibonacciNumbersInArray {

    public static void fillFibonacciNumbers() {
        int[] fibonacciNumbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 11; i++){
            fibonacciNumbers[i] = 1;
            if (i > 1) {
                fibonacciNumbers[i] = fibonacciNumbers[i-2] + fibonacciNumbers[i-1];
            }
            System.out.print(fibonacciNumbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 11; i++){
            fibonacciNumbers[i] = fibonacciNumbers[i] + 5;
            System.out.print(fibonacciNumbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        fillFibonacciNumbers();

    }
}