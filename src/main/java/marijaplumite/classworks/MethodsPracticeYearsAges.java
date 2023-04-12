package marijaplumite.classworks;

public class MethodsPracticeYearsAges {
    static void myMethod1(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }

    static void calculateAge2(int year) {
        int age = 2023 - year;
        System.out.println("Calculated age is: " + age + " years");
    }

    static void checkAge3(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static int age4 (int yearOfBirth) {
        int calculateAge = 2023 - yearOfBirth;
        return calculateAge;
    }
        public static void main (String[]args){
            myMethod1("Liam", 5);
            myMethod1("Jenny", 8);
            myMethod1("Anja", 31);
            System.out.println("2================2");
            calculateAge2(1971);
            calculateAge2(1996);
            calculateAge2(1991);
            calculateAge2(1855);
            System.out.println("3================3");
            checkAge3(20);
            checkAge3(2);
            checkAge3(95);
            System.out.println("4================4");
            System.out.println("My age is: " + age4(1996));
            int catsAge = age4(2019);
            int catsAgeInHumanYears = catsAge * 7;
            System.out.println("My cats in human years is: " + catsAgeInHumanYears);
        }
    }
