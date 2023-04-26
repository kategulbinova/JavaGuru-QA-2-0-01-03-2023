package romans.makna;

public class plusFive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Print out the original array
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Increase each element by 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }

        // Print out the updated array
        System.out.println("Updated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

