package NikitaS;

public class Homework6Part1ArraysAndMethods {
    static void printarray(int[] a) {
        for (int i = 0; i < a.length; i++ ) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] fibonacci = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < fibonacci.length; i++) {
            if (i < 2) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        printarray(fibonacci);
    }
}
