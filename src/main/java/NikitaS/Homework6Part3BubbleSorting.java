package NikitaS;

public class Homework6Part3BubbleSorting {
    static void printarray(int[] a) {
        for (int i = 0; i < a.length; i++ ) {
            System.out.print(a[i] + " ");
        }
    }
    static void sorting(int[] a) {
        int b;
        int checker = 1;
        while (checker > 0) {
            checker = 0;
            for (int i = 0; i<(a.length-1); i++) {
                if (a[i] > a[i+1]) {
                    b = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = b;
                    checker = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] random = {64, 3, 126, 3, 67, 70, 36, 600, 25, 1};
        printarray(random);
        sorting(random);
        System.out.println();
        printarray(random);


    }
}
