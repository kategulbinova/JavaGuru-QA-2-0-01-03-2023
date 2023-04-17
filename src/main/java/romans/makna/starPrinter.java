package romans.makna;

public class starPrinter {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) { // loop for 8 rows
            for (int j = 0; j < 15; j++) { // loop for 15 stars per row
                System.out.print("*"); // print one star
            }
            System.out.println(); // move to the next line after each row
        }
    }
}
