package bashar.lesson6;

public class IncreaseElementBy5Homework {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void increaseArrayBy5(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        printArray(numbers);

        increaseArrayBy5(numbers, 5);

        printArray(numbers);
    }

}
