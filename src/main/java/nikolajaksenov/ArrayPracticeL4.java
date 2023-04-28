package nikolajaksenov;

import java.util.Arrays;

public class ArrayPracticeL4 {
    public static void main(String[] args) {

        //int[] testArray = {55, 87, 84, 52, 2, 1885, -51, 784};

        /*for (int i = 0; i < testArray.length; i++) {
            if (i % 2 != 0) {
                testArray[i] += 5;
            }
            else {
                testArray[i] += 10000;
            }
            System.out.println(testArray[i]);
        }
System.out.println();*/

      /*  for (int i = 0; i < testArray.length; i++) {
            testArray[i] += 5;
            System.out.println(testArray[i]);
        }
        System.out.println();

        int[] factArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < factArray.length; i++) {
            if (i == 0) {
                System.out.println(factArray[i]);
            }
            else {
                factArray[i] = factArray[i - 1] * factArray[i];
                System.out.println(factArray[i]);

            }
        }*/
        int[] factArray2 = new int[10];

        for (int i = 0; i < factArray2.length; i++) {
            if (i == 0) {
                factArray2[i] = 1;
                System.out.println(factArray2[i]);
            } else if (i == 1) {
                factArray2[i] = 1;
                System.out.println(factArray2[i]);
            } else {
                factArray2[i] = factArray2[i - 1] + factArray2[i - 2];
                System.out.println(factArray2[i]);
            }
        }
    }
}
