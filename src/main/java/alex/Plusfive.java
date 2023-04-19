package alex;

public class Plusfive {
    public static void main(String[] args) {
        int[] numbers = {45, 87, 23, 2, -15, 67, 1005, -1235, -1076652, 0};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
           // System.out.println(numbers[i]);
            numbers[i] = numbers[i] + 5;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
