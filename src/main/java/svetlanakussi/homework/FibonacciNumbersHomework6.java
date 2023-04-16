package svetlanakussi.homework;

public class FibonacciNumbersHomework6 {
   static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static void Fibonacci (int [] arr){
        arr [0] = 1;
        arr [1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr [i] = arr [i - 1] + arr [i - 2];
        }
    }
    public static void main(String[] args) {
        int[] value = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("First 11 Fibonacci numbers: ");
        Fibonacci(value);
        printArray (value);
    }


}

