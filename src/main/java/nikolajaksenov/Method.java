package nikolajaksenov;

public class Method {
    static void myMethod() {
        System.out.println("It's a wonderful day");
    }
    static void myMethod2() {
        System.out.println("How is your day?");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i%3!=0) {
                myMethod();
            }
            else {
                myMethod2();
            }
        }
    }
}
