package olgaZikova.homework6;

public class Homework6FibonacciNumbers {
    /* Exercise:
    Create an array of integers that holds 11 zeroes
Create method with the loop inside that will fill in an array starting with the first two elements being both 1. (Every next element (starting with the third) equals to the sum of two previous elements (by the definition of Fibonacci row).
Keep in mind that array elements indexes always begin with 0
Create method to print an array (inside the method write for loop to print each element of an array).
    */

    public static void main(String[] args) {
        int [] arrayFib = {0,0,0,0,0,0,0,0,0,0,0};

        System.out.println("Array: ");
        printArrayFib(arrayFib);
        System.out.println();
        System.out.println("Fibonacci numbers: ");
        calculateFibonacci(arrayFib);
        printArrayFib(arrayFib);
    }

    //Method Nr.1
    public static void calculateFibonacci (int [] arr) {
        arr [0] = 1;
        arr [1] = 1;

        for (int i = 2; i<arr.length; i++)
        {
            arr [i]= arr [i-1] + arr[i-2];
        }
    }
    //Method Nr.2
    public static void printArrayFib (int [] arr) {
        for (int i = 0; i< arr.length; i++) {
            //System.out.println(arr [i]);
            System.out.print(arr [i] + "; ");
        }
    }
}
