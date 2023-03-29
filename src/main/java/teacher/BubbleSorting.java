package teacher;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 100, -2, -14, 12, 100};

        System.out.println("Unsorted array:");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Sorted array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
