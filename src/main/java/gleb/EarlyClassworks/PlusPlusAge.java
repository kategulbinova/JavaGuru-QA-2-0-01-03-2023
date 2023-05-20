package gleb.EarlyClassworks;

public class PlusPlusAge {
    static void printAge(int year){
        int age=2023-year;
        System.out.println("Calculated age is: "+age);
    }
    public static void main(String[] args) {
        printAge(1997);
        printAge(1993);
        printAge(1970);
        printAge(1998);
        printAge(2003);
        printAge(1590);
    }
}
