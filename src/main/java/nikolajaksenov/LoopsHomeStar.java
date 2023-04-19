package nikolajaksenov;
import java.util.Scanner;

public class LoopsHomeStar {
    public static void main(String[] args) {

        //int lines = 15;
        //int rows = 8;
        String star = "* ";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter quantity of lines: ");
        int lines = scanner.nextInt();

        System.out.print("Please enter quantity of rows: ");
        int rows = scanner.nextInt();

        scanner.close();

        for (int r = 1; r <= lines; r++) {
            for(int i = 1; i <= rows; i++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
