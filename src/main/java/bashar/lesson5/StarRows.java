package bashar.lesson5;

public class StarRows {
    public static void main(String[] args) {
        //Lesson 5 > Homework (Write a program, that will print 8 rows of 15 stars each (one star at a time).)

        int rows = 8;
        int cols = 15;

        for(int i=0; i<rows; i++) {

            for(int s=0;s<cols;s++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
