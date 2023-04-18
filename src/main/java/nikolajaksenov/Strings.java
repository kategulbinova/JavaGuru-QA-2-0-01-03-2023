package nikolajaksenov;

public class Strings {
    public static void main(String[] args) {
        String hello = "Hi everybody!";
        String secondSeq = ", What's up?";
        System.out.println(hello);
        System.out.println(hello.toUpperCase());

        int stringLen = hello.length();
        System.out.println(stringLen);

        System.out.println(hello.indexOf("everybody"));
        System.out.println(hello.contains("everybody"));
        System.out.println(hello.equals("Hi !"));
        System.out.println(hello.isBlank());
        System.out.println(hello.getClass());


        System.out.println((hello + secondSeq));
        System.out.println(hello.concat( secondSeq ));

    }

}
