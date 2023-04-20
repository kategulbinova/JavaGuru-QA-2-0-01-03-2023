package teacher.booleanexample;

public class Robot {

    private String material;
    private String name;

    private boolean isOn;

    public Robot(String material, String name) {
        this.material = material;
        this.name = name;
        this.isOn = false;
    }

    public void printYourNameToConsole() {
        System.out.println("My name is " + this.name);
    }

    public void changeYourName(String newName) {
        if (isOn == true) {
            this.name = newName;
        }
    }

    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
    }

    public int sumTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }

}
