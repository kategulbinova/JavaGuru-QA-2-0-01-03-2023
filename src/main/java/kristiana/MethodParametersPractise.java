package kristiana;

public class MethodParametersPractise {
    static void printAge(int year){
        int age = 2023 - year;
        System.out.println("Calculated age is: " + age);
    }
public static void main(String[] args) {
        printAge(934);
        printAge(1998);
        printAge(2022);
}
}
