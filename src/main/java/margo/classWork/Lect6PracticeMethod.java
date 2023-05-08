package margo.classWork;

public class Lect6PracticeMethod {
    static void ownMIMethod() {
        System.out.println("Such a challenging field is a programming field!");
    }

    static void printAge(int year) {
        int age = 2023 - year;
        System.out.println("Calculated age id: " + age);
    }
    //below is one of the ways how i've calculated Fibs in one method
    static void calculateAndPrintFibonacci() {
    int[] fibonacci = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    for (int a : fibonacci) {
        System.out.print(a + " ");
    }
    System.out.println();
    fibonacci[0] = 1;
    fibonacci[1] = 1;
    for (int i = 2; i < fibonacci.length; i++) {
        fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
    }
    for (int i : fibonacci) {
        System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        ownMIMethod();
        System.out.println();
        printAge( 1931);
        printAge( 1956);
        printAge( 1963);
        printAge( 1990);
        System.out.println();

        calculateAndPrintFibonacci();



    }
}
