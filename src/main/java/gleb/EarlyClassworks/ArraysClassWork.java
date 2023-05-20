package gleb.EarlyClassworks;

public class ArraysClassWork {
    public static void main(String[] args) {
        int[] oldArrays = {45, 87, 23, 2, -15, 67, 1005, -2345, -707, 0};

        System.out.println("Old arrays");

        for (int b = 0; b < oldArrays.length; b++) {
            System.out.println(oldArrays[b]);
        }
        for (int b = 0; b < oldArrays.length; b++) {
            oldArrays[b] = oldArrays[b] + 5;
        }

        System.out.println("New arrays");

        for (int b = 0; b < oldArrays.length; b++) {
            System.out.println(oldArrays[b]);
        }
    }
}