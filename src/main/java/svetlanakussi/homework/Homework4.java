package svetlanakussi.homework;

public class Homework4 {
    public static void main(String[] args)
    {
        /* Homework steps before code writing. 1. Create new Java class. 2. Copy main method from teacher map. */
        System.out.println("Homework 4");
        // our homework variables
        int myAge;
        // My age
        myAge = 32;
        // My cat age
        int catAge = 2;
        // short text
        System.out.println("My age - " + myAge);
        System.out.println("My cats Simon age - " + catAge);
        System.out.println("Lets calculate my cat’s age in «human» years.");
        System.out.println("«Human» years based on assumption that one cat’s year equals to 7 years of a human.");
        // add new variable
        int humanYears = 7;
        // finish result
        System.out.println("That mean my cat is already " + (catAge * humanYears) + " years old.");
        // additional question
        System.out.println("If I older than my cat? ");
        System.out.println("Result - " + (catAge < myAge));
    }
}

