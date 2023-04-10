package lieneJekabsone;

public class Practice6MethodPrintAge {
    static void printAge(int year) {
        int age = 2023 - year;
        System.out.print(year + " ");
        System.out.println("Calculated age is " + age);
    }

    public static void main(String[] args) {
        printAge(1981);
        printAge(2008);
        printAge(2020);
    }
}

