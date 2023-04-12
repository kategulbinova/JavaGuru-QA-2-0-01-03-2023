package germans;

public class PrintingText {
    static void printAge(int year) {
        int age = 2023 - year;
        System.out.println("Calculated age is " + age);

        }
        public static void main (String[]args){
            printAge( 1999);
            printAge( 1995);
            System.out.println("And one more time");
            printAge( 2022);

        }
    }

