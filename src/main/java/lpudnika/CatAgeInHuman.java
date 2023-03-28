package lpudnika;

public class CatAgeInHuman {

    public static void main(String[] args) {

        int CatMax = 5; //defining the age of the older cat
        int CatKostja = 3; //defining the age of the youngest cat
        int CatsOwnerAge = 27; //defining the age of the cat's owner
        int AgeOfCatMax = 7 * CatMax; //defining the age ot the cat Max in human years
        int AgeOfCatKostja = 7 * CatKostja; //defining the age of the cat Kostja in human years
        int AgeOfOwnerInCats = CatsOwnerAge / 7; //defining the age of the cat's owner in cat years

        System.out.println("Max is " + AgeOfCatMax + " years old in human years"); //printing the age of the cat Max in human years;
        System.out.println("Kostja is " + AgeOfCatKostja + " years old in human years"); //printing the age of the cat Kostja in human years;
        System.out.println("Cat's owner ir " + AgeOfOwnerInCats + " years old in cat years"); //printing the age of the cat's owner in cat years;
    }
}
