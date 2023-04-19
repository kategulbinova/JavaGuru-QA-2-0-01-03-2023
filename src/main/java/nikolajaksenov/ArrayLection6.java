package nikolajaksenov;

import java.util.Arrays;

public class ArrayLection6 {
    public static void main(String[] args) {

        String[] carsOne = {"Toyota", "Lada", "Maybach", "Jeep"};
        String[] carsTwo = {"Mazda", "ZAZ", "Ford", "DHC"};

        /*for (int i = 0; i < carsOne.length; i++) {
            if (i%2!=0) {
                carsOne[i] += " - Good!";
            }
            else {
                carsOne[i] += " - Very Good!";
            }
            System.out.println(carsOne[i]);
        }*/

        for (String i : carsOne) {
            System.out.println(i);
        }
        System.out.println();

        String[] result = new String[carsOne.length + carsTwo.length];

        System.arraycopy(carsOne, 0, result, 0, carsOne.length);
        System.arraycopy(carsTwo, 0, result, carsOne.length, carsTwo.length);

        System.out.println(Arrays.toString(result));
        System.out.println();

        for (String i : result) {
            System.out.println(i);
        }
        System.out.println();




    }
}
