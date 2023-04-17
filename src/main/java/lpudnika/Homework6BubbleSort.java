package lpudnika;

public class Homework6BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-55, 89, -1000, -890989, 22, 54, 3, 67, 4, 56, 999, 1000, 392, 38108019}; //defining an array of 10 random integer number

        System.out.println("Elements of random array before sorting: "); //printing the defined array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);

        System.out.println("Elements of random array sorted in ascending order: "); //printing the defined array in ascending order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
    }
}
