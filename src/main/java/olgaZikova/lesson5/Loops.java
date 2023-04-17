package olgaZikova.lesson5;

public class Loops {
    public static void main(String[] args) {
        int a = 0;
        int square;
        int cube;
        while (a < 20) {
            a++;
            square = a*a;
            cube = a*a*a;
            System.out.println(a + ". squared: " + square + "; cubed: " +cube);
        }

        for (int b = 0; b <= 20; b++) {
            System.out.println(b + " squared: " + (b*b) + "; cubed: " + (b*b*b)
            );
        }
    }
}
