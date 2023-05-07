package margo.classWork;

public class Lect6PracticeCalculator {
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int subtraction(int a, int b) {return a - b;}
    public static double division(double a, double b) {return a / b;}


    public static void main(String[] args) {
        int x = 125;
        int y = 13;

        System.out.println(x + " + " + y + " = " + addition(x, y));
        System.out.println(x + " * " + y + " = " + multiplication(x, y));
        System.out.println(x + " - " + y + " = " + subtraction(x, y));
        System.out.println(x + " / " + y + " = " + division(x, y));

        int z;

        z = multiplication( multiplication(x, y), addition(x, y) );

        System.out.println("What is this number? " + z);
    }
}
