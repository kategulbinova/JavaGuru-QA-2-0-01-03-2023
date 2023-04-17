package YanaItani;

import java.lang.constant.DynamicCallSiteDesc;

public class loopTroughArrays {
    public static void main(String[] args) {
//        String[] cars = {"Volvo", "Mazda", "BMW", "Ford"};
//        for (int i = 0; i < cars.length; i++)
//        System.out.println(cars[i]);


        int[] numbers = {10, 20, 53, 9, 86, 98, 15, 48, 16, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("--------------------------");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] +  3; //assignment
        }
        for (int numeral = 0; numeral < numbers.length; numeral++)
            System.out.println(numbers[numeral]);
        }
    }
