package lpudnika.Lessons;

public class Lesson5LoopPractice {

    public static void main(String[] args) {
        int a;
        int square;
        int cube;

        System.out.println("Number\tSquare\tCube");

        for (a=0; a < 20; a++) {
           square = a * a;
           cube = a * a * a;

           System.out.println(a + "\t" + square + "\t" + cube);
        }
        System.out.println("The end");
    }
}
