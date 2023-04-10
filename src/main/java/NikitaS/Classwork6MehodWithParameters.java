package NikitaS;

public class Classwork6MehodWithParameters {
    static void printage(int year) {
        int age = 2023 - year;
        System.out.println("Calculated age is: " + age);
    }
    public static void main (String[] args) {
        printage(1989);
        printage(2000);
        printage(2022);
    }
}
