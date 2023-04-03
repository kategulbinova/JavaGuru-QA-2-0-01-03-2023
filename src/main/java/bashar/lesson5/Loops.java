package bashar.lesson5;

public class Loops {
    public static void main(String[] args) {

        //Lesson 5 > Loops > Practice > Print out all squares and cubes of numbers from 0 to 20 using while loop

        /*int a = -1;

        while (a<20) {
            a++;
            System.out.println(a+" squared: "+(a*a)+", cube: "+(a*a*a));
        }
        System.out.println("The end.");*/



        //_______________________



        //Lesson 5 > Loops > Practice > Edit your code so that it uses for loop

        /*for (int a = 0; a < 21; a++) {
            System.out.println(a+" squared: "+(a*a)+", cube: "+(a*a*a));
        }
        System.out.println("The end.");*/



        //_______________________



        //Lesson 5 > Loops > Practice (optional) > edit so that it only prints squares and cubes for even numbers


        for (int a = 0; a < 21; a++) {
            if(a % 2 == 0) {
                System.out.println(a+" squared: "+(a*a)+", cube: "+(a*a*a));
            }
        }
        System.out.println("The end.");








    }
}
