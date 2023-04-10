package NikitaS;

public class Classwork6OldToNewArray {
    public static void main(String[] args) {
        int[] oldArray = {38, 6, -87, 42, 598, 1239, 15, -699, 12, 0};
        for (int i = 0; i < oldArray.length; i++ ) {
            System.out.print(" " + oldArray[i]);
        }
        System.out.println();

        for (int i = 0; i < oldArray.length; i++ ) {
            oldArray[i] = 5 + oldArray[i];
        }
        for (int i = 0; i < oldArray.length; i++ ) {
            System.out.print(" " + oldArray[i]);
        }

    }
}
