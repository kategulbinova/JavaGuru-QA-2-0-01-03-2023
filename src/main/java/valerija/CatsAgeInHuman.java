package valerija;

public class CatsAgeInHuman {
    public static void main(String[] args) {
        int catshumanage;
        //Variable "catshumanage" is declared
        int catsage;
        //Variable "catsage" is declared
        int myage;
        //Variable "myage" is declared
        catsage = 4;
        //Veriable "catsage" is initialized
        myage = 31;
        //Veriable "myage" is initialized
        catshumanage = catsage * 7;
        //Veriable "catshumanage" is initialized, based on assumption that 1 cat's age = 7 years of human

        System.out.println("My cat's age in human is: " + catshumanage);
        //Print result
    }
}
