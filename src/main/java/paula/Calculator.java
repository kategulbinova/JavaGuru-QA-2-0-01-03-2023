package paula;

public class Calculator {
    public static int substraction(int a, int b) { return a - b;
    }
    public static int division(int a, int b) { return a / b;
    }
    public static void main(String[] args) {
        int x = 125;
        int y = 13;

        System.out.println(x + " - " + y + " = " + substraction(x, y));
        System.out.println(x + " / " + y + " = " + division(x, y));

        int z;

        z = division( division(x, y), substraction(x, y) );

        System.out.println("What is this number? " + z);
    }
}