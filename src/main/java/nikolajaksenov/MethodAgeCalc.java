package nikolajaksenov;

import java.util.Scanner;

public class MethodAgeCalc {
    static void pringAge(int year) {
        int age = 2023 - year;
        System.out.println("Your age is: " + age);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times to calculate age?: ");
        int times = scanner.nextInt();

        for (int i = 0; i  < times; i++){

            System.out.print("Please enter year of birth: ");
            int year = scanner.nextInt();


            pringAge(year);
        }
    }


}
