package teacher;

public class IncreaseNumberBy5 {
    public static void main(String[] args) {
        int[] numbers = {12, -15, 0, 24, 10, 7803, -102099, 0, 1, 12, 675};

        for (int number : numbers) {
            System.out.print(number + "; ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 5;
        }
        for (int number : numbers) {
            System.out.print(number + "; ");
        }
    }
}
