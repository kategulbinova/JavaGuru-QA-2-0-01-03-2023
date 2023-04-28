package romans.makna;
public class plusFive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Print out the original array
        System.out.println("Original array:");
        printArray(arr);

        // Increase each element by 5
        increaseArrayValues(arr, 5);

        // Print out the updated array
        System.out.println("Updated array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void increaseArrayValues(int[] arr, int increaseAmount) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += increaseAmount;
        }
    }
}

