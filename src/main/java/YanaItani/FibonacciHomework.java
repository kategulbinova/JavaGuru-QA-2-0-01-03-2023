package YanaItani;

public class FibonacciHomework {

    static int[] Fibonacci(int[] arr) {
        arr[0] = 1;
        arr[1] = 1;


        for (int i = 2; i < arr.length; i++) {

            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    static void printArray(int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
    }

    static void printArray(String[] strings) {
        for (int j = 0; j < strings.length; j++) {
            System.out.println(strings[j]);
        }
    }
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        numbers = Fibonacci(numbers);

        printArray(numbers);


        for (int o = 0; o < numbers.length; o++) {
            numbers [o] = numbers [o] +5;
        }
        printArray(numbers);

        String[] names = {"a", "b", "Sun", "Spring", "Flowers"};
        names[0] = "a";
        names[1] = "b";
        for (int i = 2; i < names.length; i++) {

            names[i] = names[i - 1] + ", " + names[i - 2];
        }


        printArray(names);
    }
}


