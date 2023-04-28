package nikolajaksenov;

public class FibonacciHW6 {

    static int[] buildArray() {
        int[] fiboArray = new int[11];
        fiboArray[0] = 1;
        fiboArray[1] = 1;

        for (int i = 2; i < fiboArray.length; i++) {
            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
        }
        return fiboArray;
    }
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] fiboArray = buildArray();
        print(fiboArray);
    }
}
