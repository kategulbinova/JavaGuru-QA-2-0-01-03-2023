package svetlanakussi.practice;

public class CalculatorLesson6 {
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int substraction(int a, int b) {
        return a - b;
    }
    public static int division(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        int x = 125;
        int y = 5;

        System.out.println(x + " - " + y + " = " + substraction(x, y));
        System.out.println(x + " / " + y + " = " + division(x, y));
        System.out.println(x + " + " + y + " = " + addition(x, y));
        System.out.println(x + " * " + y + " = " + multiplication(x, y));
        int z;

        z = substraction( substraction(x, y), division(x, y) );

        System.out.println("What is this number? " + z);
    }

}
