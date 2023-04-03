package NikitaS;

public class WhilePractice {
    public static void main(String[] args) {
        int a = 0;
        int rem;
        //int square;
        //int cube;
        while (a < 21) {
            System.out.print(a*a + " ");
            System.out.println(a*a*a);
            a++;

        }

        a = 0;
        System.out.println(" ");
        while (a < 21) {
            rem = a % 2;
            if (rem==0) {
                System.out.print(a * a + " ");
                System.out.println(a * a * a);
            }
            a++;

        }
    }
}
