package paula;

public class MassivePractice2 {
    public static void main(String[] args) {
        int[] numbers = {1, -50, 101, 9, -3, -11, 66, 13, -211, -99};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 5;
        }
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
}