package paula;

public class homework5LoopStars
{
    public static void main(String[] args)
    {
        int rows = 8;
        int columns = 15;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
