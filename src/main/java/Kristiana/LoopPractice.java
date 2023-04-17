package Kristiana;

public class LoopPractice {
    public static void main(String[] args) {
        int a = 0;
        int square;
        int cube;
        while(a <= 20) {
            square = a*a;
            cube = a * a * a;
            System.out.println(a + " squared: " + square + "; cubed " + cube );
            a++;
        }
    }
    }
