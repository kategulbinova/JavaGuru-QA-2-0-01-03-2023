package lpudnika;

import java.util.Scanner;

public class Homework5RowsAndStarsV2 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i, j, rows, columns, symbol;

        System.out.println("Input number of rows: "); //defining the number of Rows
        rows = in.nextInt();

        System.out.println("Input number of columns: "); //defining the number of Columns (or symbol count)
        columns = in.nextInt();

        System.out.print("Input symbol: "); //defining symbol
        symbol = in.nextInt();

        for(i = 1; i <= rows; i++)
        {
            for(j = 1; j <= columns; j++)
            {
                System.out.print(symbol);
            }
            System.out.print("\n");
        }
    }
}

