package irinav.homework;

public class FibonacciNumbers {
    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};  //array with 11 zeros;
        arr[0] = 1;                                     //the first number = 1;
        arr[1] = 1;                                     // the second number also = 1;

        for (int i = 2; i < arr.length; i++) {          // loop
            arr[i] = arr[i - 1] + arr[i - 2];
                                                          // finding the previous element as teacher suggested;
        }
        printArray(arr);
    }
        public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++){           // the second loop

            System.out.print(arr[i] + " ");              // to print out numbers with a space between them;
    }
       }
    }