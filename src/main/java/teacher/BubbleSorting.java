package teacher;

public class BubbleSorting {

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
     }

     public static void sortArray(int[] array) {
         int n = array.length;

         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (array[j] > array[j + 1]) {
                     // swap arr[j] and arr[j+1]
                     int temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                 }
             }
         }
     }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 100, -2, -14, 12, 100};

        printArray(arr);
        sortArray(arr);
        printArray(arr);
    }
}
