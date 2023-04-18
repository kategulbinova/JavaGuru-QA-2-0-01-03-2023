package nikolajaksenov;

public class Boolean {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;


        boolean one = (!x);
        System.out.println(one);

        boolean two = (one ^ x);
        System.out.println(two);

        boolean three = (two && y);
        System.out.println(three);

        boolean four = (!three);
        System.out.println("Result " + four);
    }
}
