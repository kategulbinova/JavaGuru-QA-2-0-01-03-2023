package natuksa;

public class HomeworkBubbleSorting {
    static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int a = 1; a < numbers.length; a++) {
                if (numbers[a] < numbers[a - 1]) {
                    int temp = numbers[a];
                    numbers[a] = numbers[a - 1];
                    numbers[a - 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {12, 89, 1, 2, 8, 5, 23, 2, 56, 19};
        for (int i : array) {
            System.out.print(i + " ");
        }
        bubbleSort(array);
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
