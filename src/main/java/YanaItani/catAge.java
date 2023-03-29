package YanaItani;

public class catAge {
    public static void main(String[] args) {
        int OreoCat = 1;  //Defined a variable: cat's age
        int Owner = 26; // Defined a variable: my age
        int answer= 7* OreoCat; // Defined a variable that multiplies 7 years (which represents 1 cat's year to the amount of years specified in the variable 'OreoCat')
        System.out.println("My cat's age in human years is " + answer); //printing out the answer where in the double cotes i define the text i want to be printed out in combination with the answer
        answer = Owner/7;
        System.out.println("My age in cat's years is " + answer);
    }
}

