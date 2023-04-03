package svetlanakussi.practice;

public class LoopPractice {
    public static void main(String[] args) {
        int a = 0;
        int sguere;
        int cube;

        while (a <= 20) {
            a++;
            sguere = a * a;
            cube = a * a *a;
            System.out.println(a + ",squered:" + (a * a));
            System.out.println(a + ",cube:" + (a * a *a));
            System.out.println(a + ",squered:" + sguere + ",cube:" + cube);
        }
        System.out.println("The end");
    }
}

