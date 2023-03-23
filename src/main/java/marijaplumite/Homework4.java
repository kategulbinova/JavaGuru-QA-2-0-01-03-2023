package marijaplumite;

public class Homework4 {
    public static void main(String[] args) {
        int myAge; // Declare variable
        myAge = 26; // Initialize it with value 26 (my actual age in years)
        int catsAge; // Declare variable
        catsAge = 4; // Initialize it with value 4 (my cat`s actual age in years + months)
        int answer; // Declare variable answer. It is now Null
        System.out.println("My age: " + myAge); // Print out text «My age» + my actual age in years
        System.out.println("Cats age: " + catsAge); // Print out text «Cats age» + his actual age in years
        answer = catsAge*7; // Initialize variable answer with value that I got from catsAge value (3) multiply 7. So answer now holds 21.
        System.out.println("Cats age in human years = " + answer ); // Print out text «Cats age in human =» followed by what is now stored in variable answer (21)
        answer = myAge/7; // Initialize variable answer with value that I got from myAge value (26) divided 7. So answer now holds 3.
        System.out.println("My age in cats years = " + answer ); // Print out text «My age in cats years =» followed by what is now stored in variable answer (3)
    }
}
