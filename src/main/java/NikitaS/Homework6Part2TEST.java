package NikitaS;

public class Homework6Part2TEST {
    static void printarray(int[] a) {
        for (int i = 0; i < a.length; i++ ) {
            System.out.print(a[i] + " ");
        }
    }
    public static int[] increaseFive(int[] a) {
        for (int i = 0; i<a.length; i++) {
            a[i] = a[i] + 5;
        }
        return a;
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
        increaseFive(fibonacci);
       // System.out.println();
        printarray(fibonacci);
    }
}
