package lpudnika;

public class Homework6ArraysAndMethods {
    public static void main(String[] args) {
        int[] numFibonacci = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //defining an array of integers that holds 11 zeroes
        numFibonacci[0] = 1;
        numFibonacci[1] = 1; //defining that the first two elements are 1

        for (int i = 2; i < numFibonacci.length; i++) {
            numFibonacci[i] = numFibonacci[i - 1] + numFibonacci[i - 2]; //defining Fibonacci numbers using Fibonacci row
        }
        System.out.println("First 11 Fibonacci numbers are ");
        printArray(numFibonacci);

        for (int i = 0; i < numFibonacci.length; i++) {
            numFibonacci[i] += 5;
        }
        System.out.println();
        System.out.println("First 11 Fibonacci numbers increased by 5 are "); //defining Fibonacci numbers increased by 5
        printArray(numFibonacci);
    }
    public static void printArray(int[] numFibonacci) {
        for (int i = 0; i < numFibonacci.length; i++) {
            System.out.print(numFibonacci[i] + " ");
        }
    }
}

