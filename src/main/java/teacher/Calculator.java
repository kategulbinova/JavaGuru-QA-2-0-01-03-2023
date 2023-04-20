package teacher;

public class Calculator {
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static double squareRoot(int a) {
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        int x = 125;
        int y = 13;

        System.out.println(x + " + " + y + " = " + addition(x, y));
        System.out.println(x + " * " + y + " = " + multiplication(x, y));

        int z;

        System.out.println(squareRoot(13));

        z = multiplication( multiplication(x, y), addition(x, y) );

        System.out.println("What is this number? " + z);
    }
}



class CalculatorTest {

    protected void check(int expectedValue, int realValue) {
        if (expectedValue == realValue) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

}


class MyCalculatorTest extends CalculatorTest {

    public static void main(String[] args) {
        MyCalculatorTest test = new MyCalculatorTest();
        test.testCase1();
        test.testCase2();
    }

    public void testCase1() {
        Calculator calculator = new Calculator();
        int realResult = calculator.addition(1, 2);
        check(3, realResult);
    }

    public void testCase2() {

    }


}