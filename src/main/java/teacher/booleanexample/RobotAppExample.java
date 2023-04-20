package teacher.booleanexample;

public class RobotAppExample {

    public static void main(String[] args) {
        Robot robot1 = new Robot("metal", "Vasja");
        Robot robot2 = new Robot("plastic", "Petja");

        robot1.printYourNameToConsole();
        robot2.printYourNameToConsole();

        robot1.switchOn();
        robot1.switchOff();
        robot1.changeYourName("MODEL-XXI");
        robot1.printYourNameToConsole();
        robot2.printYourNameToConsole();

        System.out.println("Sum = " + robot1.sumTwoNumbers(10, 12));
    }

}
