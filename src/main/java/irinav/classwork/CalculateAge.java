package irinav.classwork;

public class CalculateAge {
    public static void printAge(int yearOfBirth) {
        int calculatedAge = 2023 - yearOfBirth;
        System.out.println("Age: " + calculatedAge);
    }

    public static int latviaAge() {
        int proclamationYear = 1918;
        return 2023 - proclamationYear;
    }
    public static void main(String[] args) {
        int myYearOfBirth = 1999;
        printAge(myYearOfBirth);
        printAge(2000);
        System.out.println("Latvia is " + latviaAge()+ " years old.");
    }
}

