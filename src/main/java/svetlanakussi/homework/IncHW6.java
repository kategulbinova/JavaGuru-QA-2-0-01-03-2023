package svetlanakussi.homework;

public class IncHW6 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void increase(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
    }

    public static void main(String[] args) {
        int[] value = {3, 6, 9, 13, 17, -8, -11, -21, -111};
        printArray(value);
        System.out.println("Increase each element by 5: ");
        increase(value);
        printArray(value);
    }
}

