package marijaplumite;

public class Homework6BubbleSortingTechnique {
    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void bubbleSort(int[] array) {
        for (int k = 0; k < array.length - 1; k++) {
            for (int p = array.length - 1; p > k; p--) {
                if (array[p - 1] > array[p]) {
                    int swap = array[p - 1];
                    array[p - 1] = array[p];
                    array[p] = swap;

                }

            }

        }
    }
        public static void main (String[]args){

            int[] array = {12, -6, 4, 1, -15, 10, 1587, -922, 1987, -44};

            System.out.print("Before sorting: ");
            printArray(array);
            System.out.print("After sorting: ");
            bubbleSort(array);
            printArray(array);

        }
    }

