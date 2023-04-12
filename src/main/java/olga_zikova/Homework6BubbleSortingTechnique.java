package olga_zikova;

public class Homework6BubbleSortingTechnique {
    public static void main(String[] args) {
        int[] numbers = {12, -3, 24, -123, 77, 43, 90, 67, 31, -69};

        System.out.println("Array before sorting: ");
        printArray(numbers);
        System.out.println("Array after sorting: ");
        sortingNumbers(numbers);
        printArray(numbers);
    }
    public static void printArray (int [] arr) {
        for (int i : arr) {
            //System.out.println(i); // print in column
            System.out.print(i + "; "); // print in line
        }
        System.out.println();
    }

    public static void sortingNumbers (int [] arr){
        //sorting from smallest to largest numbers
        for (int i = 0; i< arr.length-1; i++) {
            for (int j = 0; j<arr.length -1 -i; j++) {
                if (arr [j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
    }


}
