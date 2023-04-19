package alex;

public class Age {
    static void printAge(int year) {
        int age = 2023 - year;
        System.out.println("Calculated age is: 20" + age);
    }
    public static void main(String[] args) {
        printAge(1981);
        printAge(1998);
        printAge(2022);
    }
}
