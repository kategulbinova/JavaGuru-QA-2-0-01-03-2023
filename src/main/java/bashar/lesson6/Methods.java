package bashar.lesson6;

public class Methods {


    static void printHelloText() {
        System.out.println("Hello World!");
    }

    static void printAge(int year) {
        int age = 2023 - year;
        System.out.println("Calculated age is: " + age);
    }

    /*public static void main(String[] args) {
        printHelloText();
        System.out.println("And again!");
        printHelloText();
    }*/

    public static void main(String[] args) {
        printAge(1981);
        printAge(1998);
        printAge(2022);
    }
}
