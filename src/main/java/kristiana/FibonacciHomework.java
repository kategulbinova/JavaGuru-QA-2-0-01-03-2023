package kristiana;

public class FibonacciHomework {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
    static void calculatingFibonacci(int[]arr){
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
        public static void main (String[]args){

            int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            arr[0] = 1;
            arr[1] = 1;


            calculatingFibonacci(arr);
            printArray(arr);
        }


    }

