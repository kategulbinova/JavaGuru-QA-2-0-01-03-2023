package AlekseiKrevnev;

public class Practice {
    public static void main(String[] args) {
        int square;
        int cube;
        int a = 0;


        while (a < 20) {
            a++;
            square = a * a;
            cube=a*a*a;
            {
                System.out.println(a + " Squared " + square + " cubed " + cube);
            }

        }
        System.out.println("The end");
    }
}