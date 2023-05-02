package nzimin;

public class HWFibonacci {
    static void printFibonacci(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    static void printArray(int[] a,int number) {

        System.out.println(a[number]);
    }

    public static void main(String[] args) {
        int[] fibonacci = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        printFibonacci(fibonacci);
        printArray(fibonacci,5);
    }
}



