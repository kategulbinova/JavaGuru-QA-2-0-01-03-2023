package aleksejs_lukins;

public class MethodsPracticeLesson {

    static void printAge(int year){
        int age = 2023 - year;
        System.out.println("Age is: " + age);
    }
    public static int age(int yearOfBirth) {
        int calculatedAge = 2023 - yearOfBirth;
        return calculatedAge;
    }

    public static void main(String[] args) {
//        printAge(1990);
//        printAge(1991);
        System.out.println("My age is: " + age(1990));
        int dogsAge = age(2019);
        int dogsAgiInHumenYears = dogsAge * 7;
        System.out.println("My dog's age in human years is: " + dogsAgiInHumenYears);
    }
}