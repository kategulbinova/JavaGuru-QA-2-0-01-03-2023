package irinav.homework;

public class ArrayHometask {

    public static void main(String[] args) {

        int[] myFancyArray = {1, 4, -35, 68, 86, 91, 40, 359, 1221, 36};

        for (int j : myFancyArray) {
            System.out.print(j + " , ");
        }
        System.out.println();
        for (int i = 0; i < myFancyArray.length; i++) {
            myFancyArray[i] = myFancyArray[i] * 5;
        }
        for (int b = 0; b < myFancyArray.length; b++) {
            System.out.print(myFancyArray[b] + " , ");
        }
        System.out.println();
        System.out.println("Even Numbers");

        for (int j : myFancyArray) {
            if (j % 2 == 0) {
                System.out.print(j + ", ");
            }
        }
        System.out.println();
        System.out.println("Odd Numbers");

        for (int i : myFancyArray) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}










