package natuksa;

public class HomeworkMethods {
    static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
    static void increase(int[] arrayIncrease) {
        for (int a = 0; a < arrayIncrease.length; a++) {
            arrayIncrease[a] = arrayIncrease[a] + 5;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        printArray(numbers);
        increase(numbers);
        printArray(numbers);
    }
}
