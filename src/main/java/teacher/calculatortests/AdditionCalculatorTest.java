package teacher.calculatortests;

public class AdditionCalculatorTest extends CalculatorTest {

    public static void main(String[] args) {
        AdditionCalculatorTest test = new AdditionCalculatorTest();
        test.additionTestCase1();
        test.additionTestCase2();
        test.additionTestCase3();
    }

    public void additionTestCase1() {
        int realResult = invokeAddition(1, 2);
        checkResult(realResult, 3);
    }

    public void additionTestCase2() {
        int realResult = invokeAddition(0, 0);
        checkResult(realResult, 0);
    }


    public void additionTestCase3() {
        int realResult = invokeAddition(-1, 2);
        checkResult(realResult, 1);
    }

}
