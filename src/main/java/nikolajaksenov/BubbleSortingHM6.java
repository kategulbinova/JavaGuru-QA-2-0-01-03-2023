package nikolajaksenov;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortingHM6 {
    static int[] buildArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many figures to generate?: ");
        int n = scanner.nextInt();
        //int n = 10; // sets lenth of array.
        int[] numArray = new int[n];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 100); // sets random numbers.
        }
        return numArray;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void bubbleSortReverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {

        int[] numArray = buildArray();
        System.out.println("Original:");
        print(numArray);

        System.out.println();System.out.println(); // space

        bubbleSort(numArray);
        System.out.println("Bubble Sort:");
        print(numArray);

        System.out.println();System.out.println(); // space

        bubbleSortReverse(numArray);
        System.out.println("Bubble Sort Reversed:");
        print(numArray);
    }
}