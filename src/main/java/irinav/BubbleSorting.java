package irinav;

public class BubbleSorting {

    public static void printBubbles(int[] arr) {
                for (int i : arr) {      //loop to access each element in the array;

        System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sortNumbers(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {    //comparing elements;
            for (int j = 0; j < n - i - 1; j++) { //comparing two adjacent elements
                if (arr[j] > arr[j + 1]) {  //swapping elements
                    int x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
    }
    public static void main(String[]args) {
        int[] myBubles = {34, 78, 10, 21, 65, 43, 11, 55, 91, 18, 15, 85, 97};
        System.out.println("Here is my array of numbers!");
        printBubbles(myBubles); //calling the method
        System.out.println("Here is my sorted array of numbers!");
        sortNumbers(myBubles);
        printBubbles(myBubles);
        }
   }
