package teacher.calculatortests;

public class MultiplicationCalculatorTest extends CalculatorTest {

    public static void main(String[] args) {
        MultiplicationCalculatorTest test = new MultiplicationCalculatorTest();
        test.multiplicationTestCase1();
        test.multiplicationTestCase2();
        test.multiplicationTestCase3();
    }

    public void multiplicationTestCase1() {
        int realResult = invokeMultiplication(1, 2);
        checkResult(realResult, 2);
    }

    public void multiplicationTestCase2() {
        int realResult = invokeMultiplication(0, 0);
        checkResult(realResult, 0);
    }

    public void multiplicationTestCase3() {
        int realResult = invokeMultiplication(-1, 2);
        checkResult(realResult, -2);
    }

}
