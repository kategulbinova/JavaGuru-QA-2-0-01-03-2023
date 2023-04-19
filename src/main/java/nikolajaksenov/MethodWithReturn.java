package nikolajaksenov;

import java.util.Scanner;

public class MethodWithReturn {


    public static int ageInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter year of Birth: ");
        int Year = scanner.nextInt();
        return Year;
    }
    public static int age(int birthYear) {
        int calcAge = 2023 - birthYear;
        return calcAge;
    }
public static void main(String[] args) {
        int birthYear = ageInput();
       System.out.println("My age is: " + age(birthYear));
       ageInput();
       int dogsAge = age(birthYear);
       int dogsAgeHuman = dogsAge * 7;
       System.out.println("Dogs age in human years is: " + dogsAgeHuman);

        }


}


