package natuksa;

public class HomeworkFibonacci {
    static void printArray(int[] fibonacciPrint) {
        for (int i : fibonacciPrint) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] fibonacci= new int[11];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        printArray(fibonacci);
    }
}
