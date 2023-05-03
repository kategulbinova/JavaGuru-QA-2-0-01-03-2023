package margo.homeWorks;

public class Lect5LoopsStarsInRows {
    public static void main(String[] args) {
        //below is a loop with for-statement to print 8 rows of 15 starts each
        for (int a = 0; a < 8; a++) {
            for (int i = 0; i < 15; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("15 stars in every 8 rows");

        //below is a commented out loop with while-statement to print 8 rows of 15 starts each (for practice)
        /*int a = 0;
        while (a < 8) {
            int i = 0;
            while (i < 15) {
                i++;
                System.out.print("*");
            }
            a++;
            System.out.println();
        }
        System.out.println();*/
    }
}
