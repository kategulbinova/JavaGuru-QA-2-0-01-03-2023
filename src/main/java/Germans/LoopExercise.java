package germans;

public class LoopExercise {
    public static void main(String[] args) {
        int a = 0;
        int squared;
        int cube;
        while (a < 400) {
            a++;
            System.out.println(a + ", plus: " + (a) );
            System.out.println(a + ", squared: " + (a * a) );
            System.out.println(a + ", cube: " + (a * a * a) );
        }
        System.out.println("The end");
    }

}
