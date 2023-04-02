package bashar.lesson5;

public class StarRows2GPT {
    public static void main(String[] args) {

        int numRows = 8;
        int numCols = 15;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numCols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*This program uses two variables, numRows and numCols,
        to define the number of rows and columns of stars to print.
        It then uses nested for loops to iterate through each row and column,
        printing one star at a time using the System.out.print() method.

        The outer loop iterates over the rows, from 1 to numRows.
        The inner loop iterates over the columns, from 1 to numCols.
        Each time the inner loop runs, a single star is printed using System.out.print("*").
        After all the stars in a row have been printed,
        the inner loop exits and a newline character is printed using System.out.println() to move to the next row.

        When the program is run, it will print 8 rows of 15 stars each to the console.*/

    }
}
