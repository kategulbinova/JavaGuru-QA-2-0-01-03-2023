package olgaZikova.lesson6;

public class PrintingAge {
    static void printAge (int year) {
        int age = 2023 - year;
        System.out.println("Calculated age is " + age);
    }
    public static void main(String[] args) {
    printAge(1978);
    printAge(1999);
    printAge(2005);
    printAge(2024);
    }
}
