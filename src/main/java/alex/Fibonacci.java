package alex;

public class Fibonacci {
    public static void main(String[]args) {
       int a = 0;
       int b = 1;
       int c;
       for(int i=0;i<=20;i++)
       {
           c = a+b;
           System.out.println(a);
           a=b;
           b=c;
       }

    }
}