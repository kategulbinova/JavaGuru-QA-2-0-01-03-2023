package aleksejs_lukins;

public class Homework5LoopInsideLoopPrintingStars {

    public static void main(String[] args) {

        for (int columnCounter = 0; columnCounter < 8; columnCounter++){
            for (int lineCounter = 0; lineCounter < 14; lineCounter++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}