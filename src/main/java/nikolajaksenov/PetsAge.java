package nikolajaksenov;

//This line begins the definition of a public class named PetsAge.
public class PetsAge {
    //This line defines the main method, which is the entry point of the program.
    public static void main(String[] args) {
        //This line declares an integer variable petsAge and gives value 6.
        int petsAge = 6;
        //This line declares an integer variable petsAgeHuman.
        int petsAgeHuman;
        //Calculates pets age in human year by multiplying petsAge by 7.
        petsAgeHuman = petsAge * 7;

        //This line uses the System.out.println() method to print message about current pets age to the console.
        System.out.println("If your pets age is " + petsAge + " years.");
        //This line prints message about pets age converted to human age.
        System.out.println("Then your pets age in 'human' years is " + petsAgeHuman + ".");

    }
}
