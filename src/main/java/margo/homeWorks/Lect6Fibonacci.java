package margo.homeWorks;

public class Lect6Fibonacci {

    static int[] arrFib = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static void printZeroFib (int[] arrFib) {
        int[] printedZeroFib = arrFib.clone();
        for (int a : printedZeroFib) {
            System.out.print(a + " ");
        }
    }
    static void calculateAndPrintFib() {
        arrFib[0] = 1;
        arrFib[1] = 1;
        for (int i = 2; i < arrFib.length; i++) {
            arrFib[i] = arrFib[i - 2] + arrFib[i - 1];
        }
        for (int i : arrFib) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        printZeroFib(arrFib);
        System.out.println();
        calculateAndPrintFib();
    }
}


