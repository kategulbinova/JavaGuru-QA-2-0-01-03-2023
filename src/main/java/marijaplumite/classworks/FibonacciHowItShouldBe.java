package marijaplumite.classworks;

public class FibonacciHowItShouldBe {

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void calculateFibonacci(int[] array) {
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
    }

    public static void main(String[] args) {
        int[] fibonacciRow = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        calculateFibonacci(fibonacciRow);
        printArray(fibonacciRow);
    }
}
