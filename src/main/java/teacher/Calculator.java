package teacher;

public class Calculator {
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int x = 120;
        int y = 13;

        System.out.println(x + " + " + y + " = " + addition(x, y));
        System.out.println(x + " * " + y + " = " + multiplication(x, y));

        int z;

        z = multiplication( multiplication(x, y), addition(x, y) );

        System.out.println("What is this number? " + z);
    }
}
