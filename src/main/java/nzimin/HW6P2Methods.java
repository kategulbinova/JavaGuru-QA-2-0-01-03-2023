package nzimin;

public class HW6P2Methods{
        static void printArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]+"");
    }
    System.out.println( );
}
static void addFiveToArray(int[] a) {
            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] + 5;
            }
        }

        public static void main(String[] args) {
            int[] numbers = {1, -14, 4848, 1010, 32, 0, 123, -333, 12, 899};

            printArray(numbers);
            addFiveToArray(numbers);
            printArray(numbers);
        }
}





