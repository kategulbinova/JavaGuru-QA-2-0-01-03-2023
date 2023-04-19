package nikolajaksenov;

public class PetsAge { //This line begins the definition of a public class named PetsAge.
        public static void main(String[] args) {//This line defines the main method, which is the entry point of the program.
            int petsAge = 6;//This line declares an integer variable petsAge and gives value 6.
            int petsAgeHuman;//This line declares an integer variable petsAgeHuman.
            petsAgeHuman = petsAge * 7;//Calculates pets age in human year by multiplying petsAge by 7.


        System.out.println("If your pets age is " + petsAge + " years.");//This line uses the System.out.println() method to print message about current pets age to the console.
        System.out.println("Then your pets age in 'human' years is " + petsAgeHuman + ".");//This line prints message about pets age converted to human age.
    }
}
