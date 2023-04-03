package bashar.lesson5;

import com.beust.jcommander.IStringConverter;

public class StringsNameSurname {
    public static void main(String[] args) {

        //Lesson 5 > String concatenation > Practice

       /* String firstName = "Bashar";
        String lastName = "Al-Ahmad";

        System.out.println(firstName + " " + lastName);
        System.out.println(lastName + ", " + firstName);
        System.out.println(firstName.concat(" ").concat(lastName));
        System.out.println(lastName.concat(", ").concat(firstName));*/




        //_______________________




        //Lesson 5 >  String concatenation > Practice (optional)

        String prefix = "Miss";
        String firstName = "John";
        String lastName = "Brown";

        boolean married = false;
        boolean male = true;

        if (married) {
            prefix = "Mrs";
        }
        if (male || (male && married)) {
            prefix = "Mr";
        }

        String fullNameWithPrefix = prefix + " " + firstName + " " + lastName;
        System.out.println("Full name with prefix: " + fullNameWithPrefix);



    }
}
