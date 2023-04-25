package lieneJekabsone.Homeworks;

public class Homework5Stars {
    public static void main(String[] args) {
        int rows = 8;
        int columns = 15;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
