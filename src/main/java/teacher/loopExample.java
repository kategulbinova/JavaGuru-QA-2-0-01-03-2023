package teacher;

public class loopExample {
    public static void main(String[] args) {
        int a = 0;
        int square;
        int cube;
        while (a <= 20) {
            square = a * a;
            cube = a * a * a;
            System.out.println(a + " squared: " + square + "; cubed: " + cube);
            a++;
        }
        System.out.println("========================================================================");

        int b = 0;
        while (b <= 20) {
            System.out.println(b + " squared: " + b * b + "; cubed: " + b * b * b);
            b++;
        }

        System.out.println("========================================================================");
        for (int c = 0; c <= 20; c++) {
            System.out.println(c + " squared: " + c * c + "; cubed: " + c * c * c);
        }
    }
}
