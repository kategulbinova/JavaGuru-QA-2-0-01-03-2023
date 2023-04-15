package gleb.Homework;

public class Homework6part1FibonacciNumbers {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        numbers[0]=1;
        numbers[1]=1;
        for(int i=2;i<numbers.length;i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        printArray(numbers);
        }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

