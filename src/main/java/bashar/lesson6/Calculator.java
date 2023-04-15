package bashar.lesson6;

public class Calculator {
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int Subtraction(int a, int b) {
        return a - b;
    }

    // Explore division correctness, try improving

    public static double Division(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        }
        return (double) a / b;
    }

    // Create square root method. Create power of 2 method.

    public static double SquareRoot(int a) { return Math.sqrt(a); }
    public static double Power2(int a) { return Math.pow(a, 2); }


    public static void main(String[] args) {
        int x = 4;
        int y = 0;

        System.out.println(x + " + " + y + " = " + addition(x, y));
        System.out.println(x + " * " + y + " = " + multiplication(x, y));
        System.out.println(x + " - " + y + " = " + Subtraction(x, y));
        System.out.println(x + " / " + y + " = " + Division(x, y));
        System.out.println(x + " Sqrt = " + SquareRoot(x));
        System.out.println(x + " Power2 = " + Power2(x));

        int z;

        z = multiplication( multiplication(x, y), addition(x, y) );

        System.out.println("What is this number? " + z);
    }
}
