package olgaZikova;

public class HelloWorld {
    public static void main(String[] args) {
        //practice 1
        /*System.out.println("Hello World!");
        System.out.println("Hello Java World!");
        System.out.println("New Java start!");
        System.out.println("Olga, success is waiting you!");*/

        //practice 2
        /*int mothersAge;
        mothersAge = 60;
        int fathersAge=65;
        System.out.println("My mothers age is " + mothersAge);
        System.out.println("My fathers age is " + fathersAge);*/

        /*float myAge = 44f;
        System.out.println("My age is " + myAge );*/

        //practice 3
        /*int x = 5;
        int y = 10;
        int z = 7;
        int w = 6;
        int answer;
        answer = (x-z+(y*y));

        System.out.println("(x - z) + y * y = " + answer);
        answer = (x-z+(y*y));

        int x1 = 2;
        int y1 = 0;
        int z1 = 4;
        int w1 = -2;

        System.out.println("(w/z) + (x * z) = " + w1/y1 + (x1*z1));*/

        //Practice 4

        boolean x = true;
        boolean y = false;

        System.out.println(!x);
        System.out.println((!x)^x);
        System.out.println(((!x)^x) && y);
        System.out.println(!(((!x)^x) && y));

        boolean not_x =!x;
        boolean xor_x = !x^x;
        boolean and_xy = xor_x && y;
        boolean answer4;
        answer4 = !(xor_x&&y);
        System.out.println(answer4);




    }
}
