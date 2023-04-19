package nikolajaksenov;

public class LoopPractice {
    public static void main(String[] args) {
        int i = 0;
        int square;
        int cube;
        System.out.println("Number        Square           Cube");
        System.out.println("=====================================");
        while (i <=20 ) {

            if (i % 2 != 0) {
                square = i * i;
                cube = i * i * i;
                System.out.println(i + " odd           " + square + " odd            " + cube + " odd");
            }
            else {
                square = i * i;
                cube = i * i * i;
                System.out.println(i + " even           " + square + " even            " + cube + " even");
            }
            i++;

        }
        System.out.println();
        System.out.println("Test ended");
    }
}