package romans.makna;

public class catAge {
    public static void main(String[] args) {
        // Declare variables for age of human and cat
        int myAge = 29;
        int catAge = 3;

        // Calculate cat's age in human years (7 cat years = 1 human year)
        int catAgeInHumanYears = catAge * 7;

        // Print result to console
        System.out.println("My cat is " + catAgeInHumanYears + " years old in human years.");
    }
}
