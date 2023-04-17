package Kristiana;

public class IncreasedBy5ArrayMethod {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array: "+array[i]);
        }
    }
    public static void increasedByFive (int[] array, int b) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 5;
        }
    }
    public static void main (String[]args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printArray(numbers);
        increasedByFive(numbers,5);
        printArray(numbers);
    }
}
