package alex;

public class StarPattern {
    public static void main(String[] args){
        int rows = 15;
        int columns = 8;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
