package lieneJekabsone;

public class Practice6ArrayFactorials {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        int factorials = 1;

        for (int i = 0; i < numbers.length; i++) {
            factorials = numbers[i] * factorials;
            System.out.print(factorials + " ");
        }
    }
}