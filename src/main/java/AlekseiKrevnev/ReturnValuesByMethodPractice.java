package AlekseiKrevnev;

public class ReturnValuesByMethodPractice {
    public static int age(int yearOfBirth){
        int calculatedAge = 2023-yearOfBirth;
        return calculatedAge;
    }

    public static void main(String[] args){
System.out.println("My age is: "+age(1987));
int dogsAge=age(2022);
int dogsAgeInHumanYears=dogsAge*7;
System.out.println("My dog's age in human years is: "+dogsAgeInHumanYears);

    }
}
