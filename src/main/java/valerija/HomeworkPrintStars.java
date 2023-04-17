package valerija;

public class HomeworkPrintStars {
    public static void main(String[] args) {
        int rows = 8;
        int column = 15;

        for (int a = 0; a < rows; a++) {

            for (int b = 0; b < column; b++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
