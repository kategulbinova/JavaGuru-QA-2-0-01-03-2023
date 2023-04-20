package teacher.calculatortests;

public class CalculatorTest {

    public int invokeAddition(int param1, int param2) {
        Calculator calculator = new Calculator();
        return calculator.addition(param1, param2);
    }

    public int invokeMultiplication(int param1, int param2) {
        Calculator calculator = new Calculator();
        return calculator.multiplication(param1, param2);
    }

    public void checkResult(int realResult, int expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FAIL");
        }
    }

}
