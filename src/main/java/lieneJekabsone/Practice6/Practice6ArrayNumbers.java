package lieneJekabsone.Practice6;

public class Practice6ArrayNumbers {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Increased by 5:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 5;
            System.out.print(numbers[i] + " ");
        }
    }
}
