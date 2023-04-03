package olga_zikova;

public class Homework5PrintStars {
    public static void main(String[] args) {
        int maxRow = 8;
        int maxColumn = 15;

        for (int i=0; i<maxRow; i++){
            for (int j=0; j<maxColumn; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
