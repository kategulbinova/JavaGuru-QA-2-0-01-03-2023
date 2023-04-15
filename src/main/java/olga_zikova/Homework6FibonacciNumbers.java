package olga_zikova;

public class Homework6FibonacciNumbers {
    /* Exercise:
    Create an array of integers that holds 11 zeroes
Create method with the loop inside that will fill in an array starting with the first two elements being both 1. (Every next element (starting with the third) equals to the sum of two previous elements (by the definition of Fibonacci row).
Keep in mind that array elements indexes always begin with 0
Create method to print an array (inside the method write for loop to print each element of an array).
    */

    public static void main(String[] args) {

        int [] arrayFib = {0,0,0,0,0,0,0,0,0,0,0};
        arrayFib [0] = 1;
        arrayFib [1] = 1;

        for (int i = 2; i<arrayFib.length; i++)
        {
            arrayFib [i]= arrayFib [i-1] + arrayFib[i-2];
        }
        System.out.println("Fibonacci numbers: ");
        printArrayFib(arrayFib);

    }
    public static void printArrayFib (int [] arr) {
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr [i]);
        }
    }
}
