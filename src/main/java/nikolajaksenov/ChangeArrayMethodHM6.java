package nikolajaksenov;

import java.util.Scanner;

public class ChangeArrayMethodHM6 {

    static int[] buildArray() {
       Scanner scanner = new Scanner(System.in);

        System.out.print("How many figures to generate?: ");
        int n = scanner.nextInt();
        //int n = 10; // sets lenth of array.
        int[] numArray = new int[n];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 100); // sets random numbers.
        }
        return numArray;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

  static int[] addNumArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        arr[i] += 5;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] numArray = buildArray();
        print(numArray);

        System.out.println();System.out.println();

        addNumArray(numArray);
        print(numArray);
    }
}
