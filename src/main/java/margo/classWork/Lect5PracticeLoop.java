package margo.classWork;

public class Lect5PracticeLoop {
    public static void main(String[] args) {
        //*** below is code practice: general: long WHILE loops try out ***
        /*int a = 0;
        int square;
        int cube;
        while (a < 20) {
            a++;
            square = a*a;
            cube = a*a*a;
            System.out.println(a + " squared: " + square + "; cubed: " + cube);
        }
        System.out.println("Done.");*/

        //*** below is code practice: general: short WHILE loops try out ***
        /*int a = 0;
        while (a <= 20) {
            System.out.println(a + " squared: " + (a*a) + "; cubed: " + (a*a*a));
            a++;
        }
        System.out.println("Done.");*/

        //*** below is code practice: general: FOR loops try out ***
        /*for (int a = 0; a <= 20; a++) {
            System.out.println(a + " squared: " + (a * a) + "; cubed: " + (a * a * a));
        }
        System.out.println("Done.");*/

        //*** below is code practice: general: FOR loops from5 to - & with multiply ***
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        for (int a = 1; a <= 10; a++) {
            System.out.println("3 * " + a + " = " + 3*a);
        }
        System.out.println();

    }
}
