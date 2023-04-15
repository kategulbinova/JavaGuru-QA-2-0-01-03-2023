package olga_zikova;

public class Homework6UseMethods {

    public static void main(String[] args) {
        int [] numbers = {1, 33, 17, 40, 2, 67, 100, 78, 12, 55};

        printArrayFirstTime(numbers);
        System.out.println();
        System.out.println("New array plus five:");
        printArraySecondAddFive(numbers);
    }

        public static void printArrayFirstTime(int [] arr) {
        for (int i : arr) {
                System.out.print(i + "; ");
            }

        }
        public static void printArraySecondAddFive (int [] arr){
            for (int i = 0; i < arr.length; i++) {
                arr [i] = arr [i] +5;
            }
            for (int i: arr) {
                System.out.print(i + "; ");
            }
    }
}

