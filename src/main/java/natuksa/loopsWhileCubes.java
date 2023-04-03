package natuksa;

public class loopsWhileCubes {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Number Square Cube");
        while (a <= 20) {
            if (a % 2 == 0) {
                System.out.print(a);
                System.out.print(" " + a * a);
                System.out.println(" " + a * a * a);
            }
            if (a % 2 == 1) {
                System.out.println();
            }
            a++;
        }
    }
}
