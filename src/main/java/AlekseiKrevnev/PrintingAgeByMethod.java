package AlekseiKrevnev;

public class PrintingAgeByMethod {
    static void printAge (int year){
        int age=2023-year;
        System.out.println("Calculated age is "+age);
    }
    public static void main(String[] args){
printAge(2020);
printAge(1954);
printAge(1960);
printAge(1975);
printAge(1988);
printAge(1933);
    }
}
