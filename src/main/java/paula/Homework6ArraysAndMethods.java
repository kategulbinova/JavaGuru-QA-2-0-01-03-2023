package paula;

public class Homework6ArraysAndMethods {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        System.out.println("Array with 11 Fibonacci numbers: ");
        printArray(numbers);


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 5;
        }
        System.out.println();
        System.out.println("Increased by 5 array with 11 Fibonacci numbers: ");
        printArray(numbers);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}






