package nikolajaksenov;

public class LoopsHomeStar {
    public static void main(String[] args) {
        int lines = 2;
        int rows = 2;
        for (int r = 1; r <= lines; r++) {
            for(int i = 1; i <= rows; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
