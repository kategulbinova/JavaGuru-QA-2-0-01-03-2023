package irinav.homework;
//importing Scanner
import java.util.Scanner;

public class CatAge {
    public static void main(String[] args) {

        // declaration of a string variable, which stores a title text.
        String name = "Irina and her cute cat Bond!";

        //printing out title text.
        System.out.println(name);

        //declaration and initialization of the variable Irina's age.
        int irinaAge = 49;

        //printing out text about Irina.
        System.out.println("Irina is " + irinaAge + " years old.");

        //declaration and initialization of the variable the cat's age.
        int catAge = 4;

        //printing text about the cat.
        System.out.println("My cat Bond is " + catAge + " years old.");

        // declaration of a string variable, which stores a text.
        String newName = "I wonder how old would be Bond if he were a human. Let's count. Let's multiply my cat's age by 7.";

        //printing out text.
        System.out.println(newName);

        //print result of the multiplication.
        System.out.println("Bond would be " + catAge*7 + " years old.");

        // getting input from users.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Would you like to know how old is your cat in human years? Enter your cat's name and age:");

        // String input
        String catName = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();

        // Output of the result for users.
        System.out.println("Your cat name is  " + catName + ".");
        System.out.println("Your cat is  " + age*7+ " years old.");

    }
}

