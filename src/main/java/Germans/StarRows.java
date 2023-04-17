package germans;

public class StarRows {
    public static void main(String[] args) {
        int rows = 8;
        int column = 15;

        for (int i = 0; i < rows; i++) {

            for (int y = 0; y < column; y++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
