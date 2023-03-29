package NikitaS;

public class CatAge {
    public static void main(String[] args) {
        int myage = 33; //Declaring variable myage that represents my age and initializing it with value 33)
        int catage = 17; //Declaring variable catage that represents my cat's age and initializing it with value 17)
        int cathumanage; //Declaring variable cathumanage that represents my cat's age in human years)

        cathumanage = catage * 7; //Initialize variable cathumanage with value that we get by multiplying catage by 7.
        System.out.println("My cat's age in human years is " + cathumanage); //Print out some descriptive text and what is now stored in variable cathumanage
    }
}
