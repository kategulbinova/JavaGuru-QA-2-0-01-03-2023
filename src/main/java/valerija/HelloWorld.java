package valerija;

public class HelloWorld {
    public static void main(String[] args) {
        // Comment
        /*long comment that spans a few lines*/
       boolean x = false;
       boolean y = true;
       boolean answer;

       boolean not_x = !x;
       boolean xor_x = not_x ^ x;
       boolean and_xy = xor_x && y;
       answer = !and_xy;

       System.out.println(answer);
    }
}
