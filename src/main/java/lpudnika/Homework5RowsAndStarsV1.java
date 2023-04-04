package lpudnika;

public class Homework5RowsAndStarsV1 {
    public static void main(String args[])
    {
        int i;
        int j;
        int rows = 8; //defining the number of Rows
        int columns = 15; //defining the number of Columns (or symbol count)

        for(i = 1; i <= rows; i++)
        {
            for(j = 1; j <= columns; j++)
            {
                System.out.print("* "); //defining symbol
            }
            System.out.print("\n");
        }
    }
}

