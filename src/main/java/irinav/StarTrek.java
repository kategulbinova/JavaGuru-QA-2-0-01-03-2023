package irinav;

public class StarTrek {
    public static void main(String[] args) { //string + concatenation.
        String stars = "This is my Star Trek!";
        String latin = "Per aspera ad astra!";
        System.out.println(stars.concat(latin));

        // Outer loop.
        for (int i = 0; i <= 7; i++) {
            System.out.print(" ");// prints 8 rows
            // Inner loop
            for (int j = 0; j <= 14; j++) {
                System.out.print("*"); // prints * 15 times
            }
            System.out.println();
        }
        System.out.println("To be continued!");

            //two letter triangles
        for (int a = 1; a <= 5; ++a) { //outer loop/ rows
             for (int b = 1; b <= a; ++b) { // inner loop
                System.out.print("HI"); //printing AB letters
            }
            System.out.println(); //printing lines
        } // second triangle
        for (int a = 5; a >=1; --a) { //outer loop/ rows
            for (int b = 1; b <= a; ++b) { //inner loop
                System.out.print("OK");// printing BA letters
            }
            System.out.println(); //printing lines
        }
    }
}


