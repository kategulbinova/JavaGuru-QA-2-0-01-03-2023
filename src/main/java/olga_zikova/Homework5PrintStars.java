package olga_zikova;

public class Homework5PrintStars {
    public static void main(String[] args) {
        int maxRow = 8;
        int maxColumn = 15;

        for (int row=0; row<maxRow; row++){
            for (int column=0; column<maxColumn; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
