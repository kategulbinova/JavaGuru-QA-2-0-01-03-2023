package margo.classWork;

public class Lect4PracticeTypeBoolean {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        //example of short expression: System.out.println(!( (!x^x) && y) );

        boolean result1;
        boolean result2;
        boolean result3;
        boolean result4;

        boolean not_x = !x;
        boolean xor_x = not_x ^ x;
        boolean and_xy = xor_x && y;
        //boolean not_and_xy = !and_xy;
        result1 = !x;
        result2 = xor_x;
        result3 = and_xy;
        result4 = !and_xy;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);




    }
}
